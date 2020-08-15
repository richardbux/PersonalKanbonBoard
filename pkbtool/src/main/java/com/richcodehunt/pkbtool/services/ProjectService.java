package com.richcodehunt.pkbtool.services;

import com.richcodehunt.pkbtool.model.Project;

public interface ProjectService {

	Project saveOrUpdateProject(Project project);

	Project findProjectByIdentifier(String projectId);

	Iterable<Project> findAllProjects();

	void deleteProjectByIdentifier(String projectid);

}