package com.sdw.crawlerproxy.queue;

import java.util.concurrent.LinkedBlockingDeque;

import com.sdw.crawlerproxy.model.ProxyInfo;

public class ProxyQueue {
	
	private static final int MAX_PROXY_QUEUE_SIZE = 5000;
	private LinkedBlockingDeque<ProxyInfo> queue;
	
	private static ProxyQueue proxyQueue = new ProxyQueue();
	
	private ProxyQueue(){
		this.queue = new LinkedBlockingDeque<>(MAX_PROXY_QUEUE_SIZE);
	}
	
	public static ProxyQueue getProxyQueue(){
		return proxyQueue;
	}

	public LinkedBlockingDeque<ProxyInfo> getQueue() {
		return queue;
	}
	
}
