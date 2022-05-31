package com.track.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.track.entity.InterviewSchedule;
import com.track.exception.CandidateNotFoundException;
import com.track.exception.InterviewScheduleNotFoundException;
import com.track.repository.InterviewScheduleRepository;
import com.track.service.InterviewScheduleService;

@Service
public class InterviewScheduleServiceImpl implements InterviewScheduleService{
	
	
	@Autowired
	private InterviewScheduleRepository interviewScheduleRepo;

	@Override
	public  InterviewSchedule scheduleCandidateInterview(InterviewSchedule interviewSchedule) {
		
		
		return interviewScheduleRepo.save(interviewSchedule);
	}
		
	@Override
	public InterviewSchedule updateCandidateInterviewSchedule(InterviewSchedule interviewSchedule,int interviewScheduleID)throws InterviewScheduleNotFoundException {
		
		Optional<InterviewSchedule> interview=interviewScheduleRepo.findById(interviewScheduleID);
		
		if(interview.isPresent())
		{
			return interviewScheduleRepo.save(interview.get());

		}
		else
		{
			throw new InterviewScheduleNotFoundException("No such interview Found");
		}
     		
	}
	
	
	@Override
	public InterviewSchedule cancelCandidateInterviewSchedule(int interviewScheduleID) throws InterviewScheduleNotFoundException {
		
		
		Optional<InterviewSchedule> interviewSchedule = interviewScheduleRepo.findById(interviewScheduleID);
		
		InterviewSchedule interview = null;
		if(interviewSchedule.isPresent()) {
			interviewScheduleRepo.deleteById(interviewScheduleID);
			interview = interviewSchedule.get();
		}
		else {
			throw new InterviewScheduleNotFoundException("No such interview");
		}
		return interview;
	}
	
	
	@Override
	public InterviewSchedule giveRatingToCandidate(int interviewScheduleID) throws CandidateNotFoundException {
		
      Optional<InterviewSchedule> interview = interviewScheduleRepo.findById(interviewScheduleID);
     		InterviewSchedule interviewRating = null;
		     if(interview.isPresent()) 
		     {
		    	 interviewScheduleRepo.existsById(interviewScheduleID);
		    	 interviewRating = interview.get();
		      }
		else 
		{
			throw new InterviewScheduleNotFoundException("No such interviewScheduleID Found");
		 }
		  
		     return interviewRating;

		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
