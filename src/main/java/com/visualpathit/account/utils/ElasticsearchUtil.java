package com.visualpathit.account.utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.net.InetSocketAddress;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visualpathit.account.beans.Components;
<<<<<<< HEAD
=======
<<<<<<< HEAD
@Service
public class ElasticsearchUtil {
	
	private static Components object;
    @Autowired
    public void setComponents(Components object){
    	ElasticsearchUtil.object = object;    	
    	
    }
    public static TransportClient trannsportClient() {
    	System.out.println(" elasticsearch client");
    	String elasticsearchHost =object.getElasticsearchHost();
    	String elasticsearchPort =object.getElasticsearchPort(); 
    	String elasticsearchCluster =object.getElasticsearchCluster();
    	String elasticsearchNode =object.getElasticsearchNode();
    	System.out.println(" elasticsearchHost ........"+ elasticsearchHost);
    	System.out.println(" elasticsearchHost ........"+ elasticsearchPort);
    	TransportClient client = null;
    	try {    	
    	Settings settings = Settings.builder()    			
    			.put("cluster.name",elasticsearchCluster)
    			.put("node.name",elasticsearchNode)
    			.build();
    	client = new PreBuiltTransportClient(settings)
                .addTransportAddress(
                new InetSocketTransportAddress(
                		new InetSocketAddress(elasticsearchHost, Integer.parseInt(elasticsearchPort))));

        
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	return client;
      }
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a

@Service
public class ElasticsearchUtil {

    private static Components object;

    @Autowired
    public void setComponents(Components object) {
        ElasticsearchUtil.object = object;    	
    }

    public static RestHighLevelClient getRestHighLevelClient() {
        System.out.println("Creating Elasticsearch client...");
        String elasticsearchHost = object.getElasticsearchHost();
        String elasticsearchPort = object.getElasticsearchPort();
        
        System.out.println("Elasticsearch Host: " + elasticsearchHost);
        System.out.println("Elasticsearch Port: " + elasticsearchPort);

        RestHighLevelClient client = null;
        try {
            client = new RestHighLevelClient(
                RestClient.builder(
                    new HttpHost(elasticsearchHost, Integer.parseInt(elasticsearchPort), "http")
                )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
}
