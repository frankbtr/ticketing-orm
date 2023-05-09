package com.cydeo.mapper;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import org.modelmapper.ModelMapper;

import javax.swing.text.html.parser.Entity;

public class TaskMapper {

    private final ModelMapper modelMapper;

    public TaskMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Task convertToEntity(TaskDTO dto){
        return modelMapper.map(dto, Task.class);
    }

    public TaskDTO convertToDTO(Task entity ){
        return modelMapper.map(entity, TaskDTO.class);
    }
}
