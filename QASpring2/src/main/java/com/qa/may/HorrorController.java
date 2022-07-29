package com.qa.may;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import javax.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;	

@CrossOrigin
@RestController
public class HorrorController {
 
	@Autowired
	private HorrorService service;
	
	@GetMapping("/horrorscope")
	// Use get parameter
	public Horrorscopes gethorrorscope() {
		
		
		return new Horrorscopes("", "aqua, its a fish, youre unlucky today ", null);
	}
	
	@PostMapping("/createHorror")
	public ResponseEntity<Horrorscopes> create(@RequestBody Horrorscopes horrorscope) {
		System.out.println("Created: " + horrorscope);
		Horrorscopes created = this.service.create(horrorscope);
		return new ResponseEntity<Horrorscopes>(created, HttpStatus.CREATED);
	}

	@PatchMapping("/updateHorror/{id}")
	public Horrorscopes update(@PathVariable Integer id, @PathParam("horrorName") String horrorName,
			@PathParam("horrorDesc") String horrorDesc, @PathParam("horrorfortune") String horrorFortune) {
		return this.service.update(id, horrorName, horrorDesc, horrorFortune);
	}

	@DeleteMapping("/removeHorror/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	}


	

	
	





