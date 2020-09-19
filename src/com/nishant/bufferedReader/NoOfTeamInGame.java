package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfTeamInGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfPlayer = Integer.parseInt(br.readLine().trim());
		int teamSize = Integer.parseInt(br.readLine().trim());
		int noOfTeam = calculateNoOfTeams(noOfPlayer, teamSize);
		System.out.println(noOfTeam);
	}

	private static int calculateNoOfTeams(int noOfPlayer, int teamSize) {
		int teams = fact(noOfPlayer) / (fact(teamSize) * fact(noOfPlayer - teamSize));
		return teams;
	}

	private static int fact(int noOfPlayer) {
		int fact = 1;
		for (int i = 2; i < noOfPlayer; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
