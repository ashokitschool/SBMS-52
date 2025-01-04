package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.bindings.Quote;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
//		getRandomQuote1();
//		getRandomQuote2();
		getRandomQuote3();
	}
	
	
	public static void getRandomQuote1() {
	  
	  String apiUrl = "https://dummyjson.com/quotes/random";
		
	  WebClient webClient = WebClient.create();
		
	  Mono<String> bodyToMono = webClient.get()
								         .uri(apiUrl)
								         .retrieve()
								         .bodyToMono(String.class);
		  
	  // making synchronus call
	  String block = bodyToMono.block();
	  
	  System.out.println(block);
		
	}
	
	
	public static void getRandomQuote2() {

		String apiUrl = "https://dummyjson.com/quotes/random";
		
		WebClient webClient = WebClient.create();
		
		Mono<Quote> bodyToMono = webClient.get()
										 .uri(apiUrl)
										 .retrieve()
										 .bodyToMono(Quote.class);
		
		Quote block = bodyToMono.block();
		
		System.out.println(block);

	}
	
	public static void getRandomQuote3() {

		String apiUrl = "https://dummyjson.com/quotes/random";
		
		WebClient webClient = WebClient.create();
		
		//1
		System.out.println("======= Request sending - start  =======");
		
		webClient.get()
		         .uri(apiUrl)
		         .retrieve()
		         .bodyToMono(Quote.class)
		         .subscribe(response -> {
		        	handleResponse(response); //2
		         });

		//3
		System.out.println("==== Request sending - completed ======");
	}


	private static void handleResponse(Quote response) {
		System.out.println(response);
		// push response to kafka server
	}
	
	
}










