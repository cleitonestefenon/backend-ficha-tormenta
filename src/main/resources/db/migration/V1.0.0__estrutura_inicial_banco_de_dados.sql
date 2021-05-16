create table pessoa (
	pes_id UUID,
	pes_nome varchar(50) not null,
	pes_email varchar(50) not null,
	pes_senha varchar(255) not null,
	criado_em timestamp,
	alterado_em timestamp,
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
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_per_id primary key(per_id)
);

alter table personagem add constraint fk_personagem_pessoa foreign key(per_pessoa_id) references pessoa(pes_id);

create table item (
	ite_id integer,
	ite_descricao varchar(255),
	ite_descricao_magico varchar(255),
	ite_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_ite_id primary key(ite_id)
);

alter table item add constraint fk_item_personagem foreign key(ite_personagem_id) references personagem(per_id);

create table magia (
	mag_id UUID,
	mag_descricao varchar(255),
	mag_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_mag_id primary key(mag_id)
);

alter table magia add constraint fk_magia_personagem foreign key(mag_personagem_id) references personagem(per_id);

create table inventario (
	inv_id UUID,
	inv_descricao text,
	inv_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_inv_id primary key(inv_id)
);

alter table inventario add constraint fk_inventario_personagem foreign key(inv_personagem_id) references personagem(per_id);

create table habilidade_classe_poder (
	hcp_id UUID,
	hcp_descricao text,
	hcp_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_hcp_id primary key(hcp_id)
);

alter table habilidade_classe_poder add constraint fk_habilidade_classe_poder_personagem foreign key(hcp_personagem_id) references personagem(per_id);

create table anotacoes (
	ano_id UUID,
	ano_descricao text,
	ano_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_anotacoes_personagem primary key(ano_id)
);

alter table anotacoes add constraint fk_anotacoes_personagem foreign key(ano_personagem_id) references personagem(per_id);

create table historico (
	his_id UUID,
	his_descricao text,
	his_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_historico_personagem primary key(his_id)
);

alter table historico add constraint fk_historico_personagem foreign key(his_personagem_id) references personagem(per_id);

create table atributo (
	atr_id UUID,
	atr_descricao varchar(255),
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_atr_id primary key(atr_id)
);

create table personagem_pericia (
	pep_id UUID,
	pep_bonus_outros int,
	pep_bonus_treino int,
	pep_personagem_id UUID,
	pep_pericia_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_pep_id primary key(pep_id)
);

create table pericia (
	per_id UUID,
	per_descricao varchar(255),
	per_treinamento boolean,
	per_penalidade boolean,
	per_atributo_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pkper_id primary key(per_id)
);

alter table pericia add constraint fk_pericia_atributo foreign key(per_atributo_id) references pericia(per_id);
alter table personagem_pericia add constraint fk_personagem_pericia_personagem foreign key(pep_personagem_id) references personagem(per_id);
alter table personagem_pericia add constraint fk_personagem_pericia_pericia foreign key(pep_pericia_id) references pericia(per_id);

create table personagem_atributo (
	pea_id UUID,
	pea_total int,
	pea_modificador int,
	pea_personagem_id UUID,
	pea_atributo_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_pea_id primary key(pea_id)
);

alter table personagem_atributo add constraint fk_personagem_atributo_personagem foreign key(pea_personagem_id) references personagem(per_id);
alter table personagem_atributo add constraint fk_personagem_atributo_atributo foreign key(pea_atributo_id) references atributo(atr_id);

create table ataque (
	ata_id UUID,
	ata_descricao varchar(255),
	ata_teste_ataque int,
	ata_dano varchar(30),
	ata_critico varchar(30),
	ata_tipo_dano varchar(50),
	ata_alcance varchar(30),
	ata_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_ata_id primary key(ata_id)
);

alter table ataque add constraint fk_ataque_personagem foreign key(ata_personagem_id) references personagem(per_id);

create table habilidade_raca_origem (
	hro_id UUID,
	hro_descricao text,
	hro_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_hro_id primary key(hro_id)
);

alter table habilidade_raca_origem add constraint fk_habilidade_raca_origem_personagem foreign key(hro_personagem_id) references personagem(per_id);

create table proeficiencia (
	pro_id UUID,
	pro_descricao varchar(255),
	pro_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_pro_id primary key(pro_id)
);

alter table proeficiencia add constraint fk_proeficiencia_personagem foreign key(pro_personagem_id) references personagem(per_id);

create table defesa (
	def_id UUID,
	def_total int,
	def_modificador int,
	def_bonus_armadura int,
	def_bonus_outros int,
	def_bonus_escudo int,
	def_personagem_id UUID,
	criado_em timestamp,
    alterado_em timestamp,
	constraint pk_def_id primary key(def_id)
);

alter table defesa add constraint fk_defesa_personagem foreign key(def_personagem_id) references personagem(per_id);













