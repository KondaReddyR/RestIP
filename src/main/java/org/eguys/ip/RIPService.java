package org.eguys.ip;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/ip")
public class RIPService {
	@GET
	@Path("")
	public Response getMessage(@Context HttpHeaders headers,
			@Context HttpServletRequest req) {
		System.out.println(req.getRemoteAddr());
		return Response.ok(
				new GenericEntity<String>(req.getRemoteAddr(), String.class))
				.build();
	}
}
