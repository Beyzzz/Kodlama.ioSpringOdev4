package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageServis;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Service // bu sınıf bir businiess sınıfı nesnesidir
public class LanguageManager implements LanguageServis {
private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
	super();
	this.languageRepository = languageRepository;
}

	@Override
	public List<Language> getAll() {
		// iş kuralları
		
		return languageRepository.getAll();
	}

	@Override
	public void addToList(Language language) throws Exception {
	
		if(language.getName().isEmpty()) {
			throw new Exception("Programlama ismi boş olamaz");
		}
		for(Language language2 : getAll()) {
			if(language2.getName(). equals(language.getName())) {
				throw new Exception("Programlama dili aynı olamaz");
			}
			
		}
		languageRepository.addToList(language);
	}


	


	@Override
	public void deleteToList( int id) throws Exception {
	languageRepository.deleteToList(id);
	}
		
	

	@Override
	public void updateToList(int id, String name) {
		for(Language language : getAll()) {
			if(language.getId()== id) {
				languageRepository.updateToList(id, name);
			}
		}
		
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}
	
	

}
