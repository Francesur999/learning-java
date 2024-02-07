package formulaUno;

class MiArrayCoche {

	private Coche[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	MiArrayCoche(int longitud) {
		numElem = 0;
		miArray = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayCoche() {
		numElem = 0;
		miArray = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	public int getNumElem() {
		return numElem;
	}

	public Coche[] getMiArray() {
		return miArray;
	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Coche valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public void destruirCoche(Coche coche) {

		if (numElem > 0) {
			boolean noEncontrado = true;
			int contador = 0;
			while ((noEncontrado) && (contador < numElem)) {
				if (miArray[contador] == coche) {
					noEncontrado = false;
				} else {
					contador++;

				}
			}

			if (contador == numElem) {

				System.out.println("El coche" + coche.getModelo() + "no se encuentra en el garaje");
			} else {

				for (int i = contador; i < numElem; i++) {

					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;

			}

		} else {

			System.out.println("Garaje vacio");
		}
	}

	class MiArrayPiloto {

		private Piloto[] miArray;
		private int numElem;
		private static final int lONGITUD_DEFAULT = 10;
		private int longitud;

		MiArrayPiloto(int longitud) {
			numElem = 0;
			miArray = new Piloto[longitud];
			for (int i = 0; i < longitud; i = i + 1) {
				miArray[i] = null;
			}

		}

		MiArrayPiloto() {
			numElem = 0;
			miArray = new Piloto[lONGITUD_DEFAULT];
			for (int i = 0; i < miArray.length; i = i + 1) {
				miArray[i] = null;
			}
		}

		public int getNumElem() {
			return numElem;
		}

		public Piloto[] getMiArray() {
			return miArray;
		}

		public Piloto getIntMiArray(int posicion) {
			if ((posicion < miArray.length) && (posicion >= 0)) {
				return miArray[posicion];
			} else {
				return null; // en caso de error al meter la posición
			}
		}

		public void resetear() {
			for (int i = 0; i < miArray.length; i++) {
				miArray[i] = null;
				numElem = 0;
			}

		}

		public void insertarValor(Piloto valor) {
			if (numElem == miArray.length) {
				System.out.println("Array lleno, no se ha insertado elemento");
			} else {
				miArray[numElem] = valor;
				numElem++;
			}
		}

		public void despedirPiloto(Piloto piloto) {

			if (numElem > 0) {
				boolean noEncontrado = true;
				int contador = 0;
				while ((noEncontrado) && (contador < numElem)) {
					if (miArray[contador] == piloto) {
						noEncontrado = false;
					} else {
						contador++;

					}
				}

				if (contador == numElem) {

					System.out.println("El piloto" + piloto.getnombre() + "no se encuentra disponible");
				} else {

					for (int i = contador; i < numElem; i++) {

						miArray[i] = miArray[i + 1];
					}
					miArray[numElem] = null;

				}

			} else {

				System.out.println("No hay piloto");
			}
		}

		class MiArrayIngeniero {

			private Ingeniero[] miArray;
			private int numElem;
			private static final int lONGITUD_DEFAULT = 10;
			private int longitud;

			MiArrayIngeniero(int longitud) {
				numElem = 0;
				miArray = new Ingeniero[longitud];
				for (int i = 0; i < longitud; i = i + 1) {
					miArray[i] = null;
				}

			}

			MiArrayIngeniero() {
				numElem = 0;
				miArray = new Ingeniero[lONGITUD_DEFAULT];
				for (int i = 0; i < miArray.length; i = i + 1) {
					miArray[i] = null;
				}
			}

			public int getNumElem() {
				return numElem;
			}

			public Ingeniero[] getMiArray() {
				return miArray;
			}

			public Ingeniero getIntMiArray(int posicion) {
				if ((posicion < miArray.length) && (posicion >= 0)) {
					return miArray[posicion];
				} else {
					return null; // en caso de error al meter la posición
				}
			}

			public void resetear() {
				for (int i = 0; i < miArray.length; i++) {
					miArray[i] = null;
					numElem = 0;
				}

			}

			public void insertarValor(Ingeniero valor) {
				if (numElem == miArray.length) {
					System.out.println("Array lleno, no se ha insertado elemento");
				} else {
					miArray[numElem] = valor;
					numElem++;
				}
			}

			public void destruirIngeniero(Ingeniero ingeniero) {

				if (numElem > 0) {
					boolean noEncontrado = true;
					int contador = 0;
					while ((noEncontrado) && (contador < numElem)) {
						if (miArray[contador] == ingeniero) {
							noEncontrado = false;
						} else {
							contador++;

						}
					}

					if (contador == numElem) {

						System.out.println("El ingeniero" + ingeniero.getnombre() + "no se encuentra disponible");
					} else {

						for (int i = contador; i < numElem; i++) {

							miArray[i] = miArray[i + 1];
						}
						miArray[numElem] = null;

					}

				} else {

					System.out.println("No hay Ingeniero");
				}

			}

			class MiArrayMecanico {

				private Mecanico[] miArray;
				private int numElem;
				private static final int lONGITUD_DEFAULT = 10;
				private int longitud;

				MiArrayMecanico(int longitud) {
					numElem = 0;
					miArray = new Mecanico[longitud];
					for (int i = 0; i < longitud; i = i + 1) {
						miArray[i] = null;
					}

				}

				MiArrayMecanico() {
					numElem = 0;
					miArray = new Mecanico[lONGITUD_DEFAULT];
					for (int i = 0; i < miArray.length; i = i + 1) {
						miArray[i] = null;
					}
				}

				public int getNumElem() {
					return numElem;
				}

				public Mecanico[] getMiArray() {
					return miArray;
				}

				public Mecanico getIntMiArray(int posicion) {
					if ((posicion < miArray.length) && (posicion >= 0)) {
						return miArray[posicion];
					} else {
						return null; // en caso de error al meter la posición
					}
				}

				public void resetear() {
					for (int i = 0; i < miArray.length; i++) {
						miArray[i] = null;
						numElem = 0;
					}

				}

				public void insertarValor(Mecanico valor) {
					if (numElem == miArray.length) {
						System.out.println("Array lleno, no se ha insertado elemento");
					} else {
						miArray[numElem] = valor;
						numElem++;
					}
				}

				public void destruirMecanico(Mecanico mecanico) {

					if (numElem > 0) {
						boolean noEncontrado = true;
						int contador = 0;
						while ((noEncontrado) && (contador < numElem)) {
							if (miArray[contador] == mecanico) {
								noEncontrado = false;
							} else {
								contador++;

							}
						}

						if (contador == numElem) {

							System.out.println("El mecanico" + mecanico.getnombre() + "no se encuentra disponible");
						} else {

							for (int i = contador; i < numElem; i++) {

								miArray[i] = miArray[i + 1];
							}
							miArray[numElem] = null;

						}

					} else {

						System.out.println("No hay mecanico");
					}

				}
			}
		}
	}
}