import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public class NettyServer {
	private static int port=8000;
    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        NioEventLoopGroup boos = new NioEventLoopGroup();
        NioEventLoopGroup worker = new NioEventLoopGroup();
        serverBootstrap
                .group(boos, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel ch) {
                        ch.pipeline().addLast(new StringDecoder());
                        ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
                            @Override
                            protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                                System.out.println(msg);
                            }
                        });
                    }
                });
        bind(serverBootstrap,port);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
			Date parse = simpleDateFormat.parse("2014-10-13");
			System.out.println(parse.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void bind(ServerBootstrap serverBootstrap,Integer port) {
    	serverBootstrap.bind(port).addListener(new GenericFutureListener<Future<? super Void>>() {
             public void operationComplete(Future<? super Void> future) {
             	 if (future.isSuccess()) {
                      System.out.println("端口[" + port + "]绑定成功!");
                  } else {
                      System.err.println("端口[" + port + "]绑定失败!");
                      bind(serverBootstrap, port + 1);
                 
                  }
             }
         });
    }
}

