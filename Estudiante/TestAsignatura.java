package Estudiante;

import static org.junit.Assert.*;

import org.junit.Test;

import Entornos1.Suma;

public class TestAsignatura {

	@Test
	public static double promediarEs() {
		Asignatura español = new Asignatura(2.5, 3.5);
		double promedioEs = (español.nota1 + español.nota1) / 2;
		return promedioEs;
	}

	@Test
	public static double promediarIn() {
		Asignatura ingles = new Asignatura(4.5, 3.4);
		double promedioIn = (ingles.nota1 + ingles.nota1) / 2;
		return promedioIn;
	}

	@Test
	public static double promediarSemestre() {
		double fin = (promediarEs() + promediarIn()) / 2;
		return fin;
	}
}
