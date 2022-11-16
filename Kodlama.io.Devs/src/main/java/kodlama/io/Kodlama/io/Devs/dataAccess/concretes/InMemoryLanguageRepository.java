package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository // bu sınıf bir data acces nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "Python"));

	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void addToList(Language language) {
		languages.add(language);

	}

	

	

	@Override
	public void deleteToList(int id) {
		for(Language language: languages) {
			if(language.getId()== id) {
				languages.remove(language);
				break;
			}
		}
		
		
	}

	@Override
	public void updateToList(int id, String name) {
		// TODO Auto-generated method stub
		for(Language languagee : languages) {
			if(languagee.getId()== id) {
				languagee.setName(name);
				break;
			}
		}
		
	}

	@Override
	public Language getById(int id) {
		for(Language language1 : languages) {
			if(language1.getId()== id) {
				return language1;
			}
		}
		return null;
	}


	

}
