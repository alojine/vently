package com.management.vently.service.Impl;

import com.management.vently.model.Event;
import com.management.vently.repository.EventRepository;
import com.management.vently.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event put(Event event) {
        Event updatedEvent = eventRepository.getReferenceById(event.getId());
        updatedEvent.setName(event.getName());
        updatedEvent.setLocation(event.getLocation());
        updatedEvent.setTicket(event.getTicket());
        updatedEvent.setDate(event.getDate());
        updatedEvent.setType(event.getType());

        return eventRepository.save(updatedEvent);
    }
}
