package com.customer.main;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;

import com.customer.dao.CustomerDAO;
import com.customer.dto.CustomerDTO;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import oracle.net.aso.e;

public class OpenCSVMain {

	public static void main(String[] args) {
		
		// Load .csv file and save directly to SQL as soon as CustomerDAO constructor is built
		CustomerDAO customerDAO = new CustomerDAO();
	}
}
