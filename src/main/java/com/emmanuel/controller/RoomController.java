package com.emmanuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emmanuel.entity.Room;
import com.emmanuel.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("rooms", roomService.showAllRooms());
		model.setViewName("index");
		return model;
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView userRegister(@ModelAttribute("room")Room room)
	{
		roomService.saveRoom(room);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/{roomNumber}/delete", method = RequestMethod.GET)
	public ModelAndView deleteUsers(@PathVariable Integer roomNumber) {
		roomService.deleteRoom(roomNumber);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/{roomNumber}/edit", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable Integer roomNumber) {
		ModelAndView model = new ModelAndView();
		Room room = roomService.showRoomByNumber(roomNumber);
		model.addObject("room", room);
		model.setViewName("edit");
		return model;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("roomNumber") Integer roomNumber,
			@RequestParam("roomName") String roomName,@RequestParam("floor") String floor,
			@RequestParam("building") String building) {
		Room room = roomService.showRoomByNumber(roomNumber);
		System.out.println("******-------"+room);
		room.setBuilding(building);
		room.setFloor(floor);
		room.setRoomName(roomName);
		roomService.saveRoom(room);
		return new ModelAndView("redirect:/");
	}

}
