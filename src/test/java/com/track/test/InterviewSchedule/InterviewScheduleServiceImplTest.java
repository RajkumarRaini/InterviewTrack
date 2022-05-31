//package com.track.test.InterviewSchedule;
////package com.track.test.InterviewSchedule;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.track.entity.Candidate;
//import com.track.entity.Employee;
//import com.track.entity.InterviewSchedule;
//import com.track.repository.InterviewScheduleRepository;
//import com.track.serviceimpl.InterviewScheduleServiceImpl;
//import static org.junit.Assert.assertThat;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InterviewScheduleServiceImplTest {
//	@Autowired
//	public InterviewScheduleServiceImpl interviewScheduleServiceImpl;
//
//	@MockBean
//	private InterviewScheduleRepository interviewScheduleRepo;
//	
//	@Test
//	public  void testAssertList()
//	{
//		List<Employee>list= ArrayList<>();
//		
//	
//       
//		
//
//	}
//
//
//	@Test
//	public void scheduleCandidateInterview() {
//
//		Candidate candidate=new Candidate();
//		candidate.setUserId(22);
//		candidate.setName("manoj");
//		candidate.setGender("male");
//
//		candidate.setUserName("manoj");
//		candidate.setPassword("123123");
//
//		candidate.setPrimarySkils("java");
//		candidate.setSecondarySkils("c");
//		candidate.setExperience(3);
//		candidate.setQualification("btech");
//		candidate.setDesignation("developer");
//		candidate.setNoticePeriod(3);
//		candidate.setLocation("warangal");
//		candidate.setStatus("selected");
//		
//		InterviewSchedule interviewSchedule =new InterviewSchedule();
//		interviewSchedule.setCandidate(candidate);
//		
//		interviewSchedule.setFinalStatus("No response");
//		interviewSchedule.sethRRating(0);
//		interviewSchedule.setInterviewScheduleID(14);
//		interviewSchedule.setPanel(null);
//		interviewSchedule.setRating("No response");
//		interviewSchedule.setTechRating(0);
//				
//
//		Mockito.when(interviewScheduleRepo.save(interviewSchedule)).thenReturn(interviewSchedule);
//		assertThat(interviewScheduleServiceImpl.scheduleCandidateInterview(interviewSchedule)).isEqualTo(interviewSchedule);
//	}
//
//
//		@Test
//	public void throwExceptionWhenInterviewScheduleIDNotFound() {
//	    int id = anyInt();
//	    when(interviewScheduleRepo.findById(id)).thenReturn(Optional.empty());
//	    assertThatAnExceptionWasThrown(String.format("Quarter does not exist for id = %s!", id));
//	}
//
//
//	private void assertThatAnExceptionWasThrown(String format) {
//		
//	}
//
//	@Test
//	public void cancelCandidateInterviewSchedule() {
//
//		 Optional<InterviewSchedule> interview = Optional.of(new InterviewSchedule());
//
//		 InterviewSchedule interviewSchedule1 =new InterviewSchedule();
//		 Candidate candidate=new Candidate();
//			candidate.setUserId(22);
//			candidate.setName("manoj");
//			candidate.setGender("male");
//
//			candidate.setUserName("manoj");
//			candidate.setPassword("123123");
//
//			candidate.setPrimarySkils("java");
//			candidate.setSecondarySkils("c");
//			candidate.setExperience(3);
//			candidate.setQualification("btech");
//			candidate.setDesignation("developer");
//			candidate.setNoticePeriod(3);
//			candidate.setLocation("warangal");
//			candidate.setStatus("selected");
//
//		    interviewSchedule1.setInterviewScheduleID(14);
//			interviewSchedule1.setCandidate(candidate);
//			interviewSchedule1.setFinalStatus("pending");
//			interviewSchedule1.sethRRating(3);
//			//interviewSchedule1.setPanel(tr);
//			interviewSchedule1.setRating("pending");
//			interviewSchedule1.setTechRating(4);	
//
//		
//		
//		
//
//		 Mockito.when(interviewScheduleRepo.findById(14)).thenReturn(interview);
//		//when(candidateRepo.findById(22)).thenReturn(Optional.empty());
//		assertThat(interviewScheduleServiceImpl.cancelCandidateInterviewSchedule(14)).isEqualTo(interview);
//
//		
//	}
//
//
//@Test
//public void throwExceptionWhenCandidateIDNotFound() {
//    int id = anyInt();
//    when(interviewScheduleRepo.findById(id)).thenReturn(Optional.empty());
//    assertThatAnExceptionWasThrown(String.format("Quarter does not exist for id = %s!", id));
//}
//
//
//
//
//	@Test
//	public void giveRatingToCandidate()	{
//	Optional<InterviewSchedule> interview = Optional.of(new InterviewSchedule());
//	
//
//	 InterviewSchedule interviewSchedule2 =new InterviewSchedule();
//	 Candidate candidate=new Candidate();
//		candidate.setUserId(22);
//		candidate.setName("manoj");
//		candidate.setGender("male");
//
//		candidate.setUserName("manoj");
//		candidate.setPassword("123123");
//
//		candidate.setPrimarySkils("java");
//		candidate.setSecondarySkils("c");
//		candidate.setExperience(3);
//		candidate.setQualification("btech");
//		candidate.setDesignation("developer");
//		candidate.setNoticePeriod(3);
//		candidate.setLocation("warangal");
//		candidate.setStatus("selected");
//
//	    interviewSchedule2.setInterviewScheduleID(14);
//		interviewSchedule2.setCandidate(candidate);
//		interviewSchedule2.setFinalStatus("selected");
//		interviewSchedule2.sethRRating(5);
//	//	interviewSchedule2.setPanel(tr);
//		interviewSchedule2.setRating("selected");
//		interviewSchedule2.setTechRating(5);	
//		
//		
//		Mockito.when(interviewScheduleRepo.findById(14)).thenReturn(interview);
//		assertThat(interviewScheduleServiceImpl.giveRatingToCandidate(14)).isEqualTo(interview);
//
//
//	
//		
//		
//	}
//
//}
