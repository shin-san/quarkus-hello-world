import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Slf4j
@Path("/hello")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld() {
        log.info("GET request helloWorld() invoked!");
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public String greeting(@PathParam("name") String name) {
        log.info("GET request greeting() invoked!");
        return "Hello " + name;
    }
}
