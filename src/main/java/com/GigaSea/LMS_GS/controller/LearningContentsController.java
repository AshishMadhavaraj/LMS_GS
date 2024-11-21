package com.GigaSea.LMS_GS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearningContentsController {

    // Display the Learning Contents page
    @GetMapping("/learningContents")
    public String showLearningContents(Model model) {
        // You can add attributes to the model if needed
        return "learningContents"; // This corresponds to the learningContents.html template
    }

    // Display Data Structures topic
    @GetMapping("/data-structures")
    public String showDataStructures(Model model) {
        // Add any necessary attributes to the model
        return "data-structures"; // This should correspond to data-structures.html template
    }

    // Display Algorithms topic
    @GetMapping("/algorithms")
    public String showAlgorithms(Model model) {
        // Add any necessary attributes to the model
        return "algorithms"; // This should correspond to algorithms.html template
    }

    // Display Software Engineering topic
    @GetMapping("/software-engineering")
    public String showSoftwareEngineering(Model model) {
        // Add any necessary attributes to the model
        return "software-engineering"; // This should correspond to software-engineering.html template
    }

    // Display Database Management topic
    @GetMapping("/database-management")
    public String showDatabaseManagement(Model model) {
        // Add any necessary attributes to the model
        return "database-management"; // This should correspond to database-management.html template
    }

    // Display Operating Systems topic
    @GetMapping("/operating-systems")
    public String showOperatingSystems(Model model) {
        // Add any necessary attributes to the model
        return "operating-systems"; // This should correspond to operating-systems.html template
    }

    // Display Computer Networks topic
    @GetMapping("/computer-networks")
    public String showComputerNetworks(Model model) {
        // Add any necessary attributes to the model
        return "computer-networks"; // This should correspond to computer-networks.html template
    }

    // Display Web Development topic
    @GetMapping("/web-development")
    public String showWebDevelopment(Model model) {
        // Add any necessary attributes to the model
        return "web-development"; // This should correspond to web-development.html template
    }

    // Display Machine Learning topic
    @GetMapping("/machine-learning")
    public String showMachineLearning(Model model) {
        // Add any necessary attributes to the model
        return "machine-learning"; // This should correspond to machine-learning.html template
    }

    // Display Artificial Intelligence topic
    @GetMapping("/artificial-intelligence")
    public String showArtificialIntelligence(Model model) {
        // Add any necessary attributes to the model
        return "artificial-intelligence"; // This should correspond to artificial-intelligence.html template
    }

    // Display Cybersecurity topic
    @GetMapping("/cybersecurity")
    public String showCybersecurity(Model model) {
        // Add any necessary attributes to the model
        return "cybersecurity"; // This should correspond to cybersecurity.html template
    }
}