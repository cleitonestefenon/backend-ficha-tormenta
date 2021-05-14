create table pessoa (
	pes_id UUID,
	pes_nome varchar(50) not null,
	pes_email varchar(50) not null,
	pes_senha varchar(255) not null,
	constraint pk_pes_id primary key(pes_id)
);



create table personagem (
	per_id UUID,
	per_nome varchar(50),
	per_raca varchar(50),
	per_origem varchar(50),
	per_classe varchar(50),
	per_nivel int,
	per_divindade varchar(50),
	per_vida_total int,
	per_mana_total int,
	per_vida_atual int,
	per_mana_atual int,
	per_deslocamento int,
	per_pontos_exp int,
	per_pessoa_id UUID,
	constraint pk_per_id primary key(per_id)
);

alter table personagem add constraint fk_personagem_pessoa foreign key(per_pessoa_id) references pessoa(pes_id);

create table item (
	ite_id integer,
	ite_descricao varchar(255),
	ite_descricao_magico varchar(255),
	ite_personagem_id UUID,
	constraint pk_ite_id primary key(ite_id)
);

alter table item add constraint fk_item_personagem foreign key(ite_personagem_id) references personagem(per_id);

create table magia (
	mag_id UUID,
	mag_descricao varchar(255),
	mag_personagem_id UUID,
	constraint pk_mag_id primary key(mag_id)
);

alter table magia add constraint fk_magia_personagem foreign key(mag_personagem_id) references personagem(per_id);

create table inventario (
	inv_id UUID,
	inv_descricao text,
	inv_personagem_id UUID,
	constraint pk_inv_id primary key(inv_id)
);

alter table inventario add constraint fk_inventario_personagem foreign key(inv_personagem_id) references personagem(per_id);


