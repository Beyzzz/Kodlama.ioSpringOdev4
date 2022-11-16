package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageServis;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	// istekler burda yapılır.
	private LanguageServis languageServis;

	public LanguagesController(LanguageServis languageServis) {
		super();
		this.languageServis = languageServis;
	}
	@GetMapping("/getAll")
	 public List<Language> getAll(){
		 return languageServis.getAll();
	 }
	
	@PostMapping("/addToList")
	public void addToList(Language language) throws Exception{
		languageServis.addToList(language);
	}
	@DeleteMapping("/{id}")
	public void deleteToList(@PathVariable int id) throws Exception{
		languageServis.deleteToList(id);
		
	}
	@PutMapping("/{id}")
	public void updateToList(@PathVariable int id,@RequestBody String name)
	{ 
		 languageServis.updateToList(id,name);
	}
	@GetMapping("/{id}")
	Language getById(@PathVariable int  id) {
		return languageServis.getById(id);
	}
}
