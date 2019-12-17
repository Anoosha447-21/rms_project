package com.sathya.rms.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.ShiftTypeRepository;
import com.sathya.rms.entities.ShiftType;
import com.sathya.rms.services.ShiftTypeService;
@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {
	@Autowired
	ShiftTypeRepository shiftTyperepository;
	@Transactional
	@Override
	public ShiftType addShiftType(ShiftType shifttype) {
		// TODO Auto-generated method stub
		return shiftTyperepository.save(shifttype);
	}

	@Override
	public ShiftType updateShiftType(ShiftType shifttype) {
		// TODO Auto-generated method stub
		return shiftTyperepository.save(shifttype);
	}

	@Override
	public void deleteShiftType(Integer id) {
		shiftTyperepository.deleteById(id);
	}

	@Override
	public Iterable<ShiftType> getAllShiftTypes() {
		// TODO Auto-generated method stub
		return shiftTyperepository.findAll();
	}

}
