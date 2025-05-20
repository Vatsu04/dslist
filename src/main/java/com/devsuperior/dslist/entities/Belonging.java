package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList list, Integer position) {

		id.setGame(game);
		id.setList(list);
		this.position = position;
	}
	
}
