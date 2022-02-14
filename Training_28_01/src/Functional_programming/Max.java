//package Functional_programming;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.stream.BaseStream;
//
//public class Max {
//
//	int longest = Files.lines(Paths.get("haiku.txt"))
//		    .mapToInt(String::length)
//		    .max()
//		    .getAsInt();
//		 
//		BaseStream operations:
//			
//		File.lines -> ["haiku are funny",
//		       "but sometimes they don't make sense",
//		                "refrigerator"]
//		-> mapToInt -> [15, 35, 12]
//		     -> max -> 35
//}
