package com.qa.may;

	
public class Horrorscopes {


		// Attributes

		//@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		private String horrorName;

		private String horrorDesc;

		private String horrorFortune;

		// Default Constructor
		public Horrorscopes() {
			super();
		}

		// Constructor without ID
		public Horrorscopes(String horrorName, String horrorDesc, String horrorfortune) {
			super();
			this.horrorName = horrorName;
			this.setHorrorDesc(horrorDesc);
			this.setHorrorFortune(horrorfortune);
		}

		// Everything Constructor
		public Horrorscopes(Integer id, String horrorName, String horrorDesc, String horrorfortune) {
			super();
			this.id = id;
			this.horrorName = horrorName;
			this.setHorrorDesc(horrorDesc);
			this.setHorrorFortune(horrorfortune);
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String gethorrorName() {
			return horrorName;
		}

		public void sethorrorName(String horrorName) {
			this.horrorName = horrorName;
		}
		

		public String getHorrorDesc() {
			return horrorDesc;
		}

		public void setHorrorDesc(String horrorDesc) {
			this.horrorDesc = horrorDesc;
		}

		public String getHorrorFortune() {
			return horrorFortune;
		}

		public void setHorrorFortune(String horrorFortune) {
			this.horrorFortune = horrorFortune;
		}
}

