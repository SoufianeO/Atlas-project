package org.sid.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudGatewayApplication {
  // @Bean
    RouteLocator routes(RouteLocatorBuilder builder){
       return builder.routes()
               .route(r->r.path("/transactions/**").uri("lb://TRANSACTION-SERVICE").id("r1"))
               .route(r->r.path("/comptes/**").uri("lb://COMPTE-SERVICE").id("r2"))
               .route(r->r.path("/clients/**").uri("lb://CLIENT-SERVICE").id("r3"))
               .build();



   }

   @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc , DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc , dlp);
   }


    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

}
