package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements IMoodService {
	
	private List<String> moods;
	private Random random;
	private List<String> reasons;
	
	@PostConstruct
	public void init() {
		moods = new ArrayList<String>();
		moods.add("Happy");
		moods.add("Sad");
		moods.add("Irritated");
		moods.add("Excited");
		moods.add("Horrified");
		moods.add("Energetic");
		
		reasons = new ArrayList<String>();
		reasons.add("it is long weekend");
		reasons.add("I like Sadness in Inside Out");
		reasons.add("being happy is too mainstream");
		reasons.add("learning Spring makes me feel so");
		reasons.add("I'm just back from Grudge horror movie");
		reasons.add("I just drank a RedBull");
		random = new Random(); 
	}

	/* (non-Javadoc)
	 * @see edu.asu.diging.tutorial.spring.one.service.IMoodService#getCurrentMood()
	 */
	public Mood getCurrentMood() {
		int randomInt = random.nextInt(moods.size());
		return new Mood(moods.get(randomInt));
    }

	public String getReason(String mood) {

		if(mood.equals("Happy")) return reasons.get(0);
		else if(mood.equals("Sad")) return reasons.get(1);
		else if(mood.equals("Irritated")) return reasons.get(2);
		else if(mood.equals("Excited")) return reasons.get(3);
		else if(mood.equals("Horrified")) return reasons.get(4);
		else if(mood.equals("Energetic")) return reasons.get(5);
		
		else return("I'm not sure of the reason");
	}

}
