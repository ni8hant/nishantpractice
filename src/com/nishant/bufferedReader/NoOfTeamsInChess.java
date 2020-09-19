package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfTeamsInChess {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfPlayer = Integer.parseInt(br.readLine().trim());
		int team = NoOfTeam(noOfPlayer);
		System.out.println(team);
	}

	private static int NoOfTeam(int noOfPlayer) {
	    int var = (noOfPlayer-1)*(noOfPlayer);
	    int team = var/2;
		return team;
	}

}
