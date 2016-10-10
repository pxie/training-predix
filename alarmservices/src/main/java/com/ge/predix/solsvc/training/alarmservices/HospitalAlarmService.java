package com.ge.predix.solsvc.training.alarmservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.predix.solsvc.training.alarmservices.dto.AlarmEvent;
import com.ge.predix.solsvc.training.alarmservices.entity.AlarmEventEntity;
import com.ge.predix.solsvc.training.alarmservices.repository.IAlarmEventEntityRepository;

@RestController
public class HospitalAlarmService {

	@Autowired
	private IAlarmEventEntityRepository alarmService;

	@RequestMapping("/alarmservices")
	public @ResponseBody List<AlarmEvent> helloWorld() {
		List<AlarmEvent> events = new ArrayList<AlarmEvent>();
		List<AlarmEventEntity> entities = this.alarmService.findAll();
		for (AlarmEventEntity entity:entities) {
			events.add(entity.toAlarmEvent());
		}
		return events;
	}
}