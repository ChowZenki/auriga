//= Auriga Script ==============================================================
// Ragnarok Online Wolfchev's Laboratory Script	by refis
//==============================================================================

lhz_dun04.gat,151,276,3	script	������#memo	865,{
	switch(LHZ_6QUE) {
	case 7:
		mes "�]�������̔��̑O��";
		mes "�@�{���Z�u�͍������Ă���]";
		next;
		mes "[�{���Z�u]";
		mes "�L�q�c�c";
		mes "�Ȃ����@�H�@�Ȃ������̂�";
		mes "�����܂œ����Ă����!?";
		mes "�c�c�܂����A���̃{�^����";
		mes "�\�������̂�!?";
		next;
		menu "�{���Z�u!!",-;
		mes "[�{���Z�u]";
		mes "�L�q�b!?";
		mes "�ȂȂȂȁA�Ȃ�!?";
		next;
		menu "���̃{�^���ɂ��Ė₢�l�߂�",-;
		mes "[�{���Z�u]";
		mes "���A���b�P���x������n���ꂽ";
		mes "���{�^�����B";
		mes "�ז��҂�r������Ƃ���";
		mes "�����悤�Ɍ����āc�c�B";
		mes "�c�c�����P����Ȃ�āc�c";
		mes "�L�q�A�L�q�q�c�c";
		next;
		mes "[�{���Z�u]";
		mes "��������������I�@�V�X�e����";
		mes "�\�������Ƃ���ƁA^46B951�R�A������^000000��";
		mes "�ڊo�߂Ă��܂����\��������I";
		next;
		menu "^46B951�R�A�����́H^000000",-;
		mes "[�{���Z�u]";
		mes "���A�����ɂ�������̂�����";
		mes "���o�����߂̂��ƂƂȂ���";
		mes "^46B95113�̂̎�����^000000�̂��Ƃ��B";
		next;
		mes "[�{���Z�u]";
		mes "13�̂̃R�A�����̂́A";
		mes "��x�ɖڊo�߂鎖���ł��Ȃ��悤";
		mes "�������������Ă��邪�c�c�B";
		mes "1��1�̂����ɋ��͂��B";
		next;
		mes "[�{���Z�u]";
		mes "�����œ�������Ă���z��Ƃ�";
		mes "��ׂ��̂ɂȂ�Ȃ��قǂ�";
		mes "���A���ȗ͂������Ă���c�c�B";
		next;
		mes "[�{���Z�u]";
		mes "�����������A���O�I";
		mes "���A���A���͖\������������";
		mes "���ׂȂ��Ă͂����Ȃ��B";
		mes "���̂��߂ɂ͈�ԉ���";
		mes "�������܂ōs���K�v������I";
		next;
		mes "[�{���Z�u]";
		mes "�������̈�ԉ��̌������Ƃ����̂��A";
		mes "^46B951�R�A������^000000������ꏊ�Ȃ񂾁B";
		mes "������A���������r���������B";
		next;
		mes "[�{���Z�u]";
		mes "�������ɓ����悤�ɂ��Ă�邩��A";
		mes "^46B951�R�A������^000000��r�����Ă���I";
		next;
		menu "�f��",-;
		mes "[�{���Z�u]";
		mes "����I�@���₢�₢��I";
		mes "�R�A�����̂��������̊O�ɏo����";
		mes "��ςȂ��ƂɂȂ邼�H�H";
		mes "�ȁH�@�~�߂�������H";
		mes "�ȁH�@�ȁH";
		next;
		menu "��ނ𓾂������󂯂�",-;
		mes "[�{���Z�u]";
		mes "�L�q�b�c�c";
		mes "���̌������̓����́A";
		mes "���������ɂ����J�����Ȃ�����ȁB";
		mes "�悧�����A�����悤�Ɏ�z���悤�B";
		next;
		mes "[�{���Z�u]";
		mes "13�̂̃R�A�����̂̂����A";
		mes "�ǂꂪ�ڊo�߂Ă��邩��";
		mes "�m�邱�Ƃ͂ł��Ȃ��B";
		mes "���ׂē|���ɂ́A���x���ʂ���";
		mes "�Ⴄ���ƂɂȂ�B";
		next;
		mes "[�{���Z�u]";
		mes "�����A���ׂẴR�A�����̂�1�x�ł�";
		mes "�|���΁A�\���͎��܂邾�낤�B";
		mes "���̂悤�Ƀv���O��������Ă���";
		mes "����ȃ@�B";
		next;
		mes "[�{���Z�u]";
		mes "���ׂē|������A����������";
		mes "����ł��Ȃ����I�@�L�q�q�c�c";
		delquest 5111;
		setquest 5113;
		setquest 5114;
		setquest 5115;
		setquest 5116;
		setquest 5117;
		setquest 5118;
		setquest 5119;
		setquest 5120;
		setquest 5121;
		setquest 5122;
		setquest 5123;
		setquest 5124;
		setquest 5125;
		setquest 5126;
		set LHZ_6QUE,8;
		next;
		mes "[�{���Z�u]";
		mes "���ꂩ��A�������ւ�";
		mes "�p�[�e�B�[��g��ł��Ȃ��Ă�";
		mes "����Ȃ����H�H";
		mes "�댯������ȃ@�c�c�B";
		next;
		mes "[�{���Z�u]";
		mes "���ザ�ザ�㏀�����I�������A";
		mes "���Ɍ����Ă���I";
		mes "�L�q�q�q�q�c�c";
		close;
	case 8:
	case 11:
		for(set '@i,5113;'@i<5126;set '@i,'@i+1) {
			set '@total,'@total + ((checkquest('@quest) & 0x4) == 0);
		}
		if('@total == 0) {
			mes "[�{���Z�u]";
			mes "�L�q�q�q�q�c�c";
			mes "���ׂẴR�A�����̂�";
			mes "�|�����悤���ȃ@�H";
			next;
			mes "[�{���Z�u]";
			mes "�������ɒʂ��āA";
			mes "���ɂ��킩�������Ƃ����邼�H�B";
			mes "�L�q�q�I�@�����������H";
			next;
			mes "[�{���Z�u]";
			mes "�����̂����͂ȃ@�I";
			mes "�\�����Ă����񂶂�Ȃ��I";
			mes "���{�^���������ꂽ��A";
			mes "�蓖�莟��ɍU������悤��";
			mes "�ݒ肳��Ă���!!";
			mes "�܂�c�c";
			next;
			mes "[�{���Z�u]";
			mes "���������b�P���x���̓@�@�@�I";
			mes "�L�q�q�I�@�����������牴����";
			mes "�ז��҂��������Ƃ��Ă�����";
			mes "�������Ƃ�!!";
			mes "�L�[�q�q�q�q�q!!";
			next;
			mes "[�{���Z�u]";
			mes "�A�@�@�H�@�ǂ��������Ƃ��H";
			mes "�����ז��ҁH";
			mes "�ז��҂����Ă����̂���!?";
			mes "�L�q�A�L�q�q�q�I";
			next;
			mes "[�{���Z�u]";
			mes "�L�q�q�c�c";
			mes "�@";
			mes "���́c�c���؂�ꂽ�̂��c�c�B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c";
			next;
			mes "[�{���Z�u]";
			mes "������!?";
			mes "���������܍����C�Â����̂�����";
			mes "�c���I�@�c�����Ȃ�������!?";
			next;
			mes "[�{���Z�u]";
			mes "���b�P���x���͂Ȃ��I";
			mes "���b�P���x�������͉��̎�����";
			mes "�݂݂ݔF�߂�!!";
			next;
			mes "[�{���Z�u]";
			mes "�L�A�L�q�I";
			mes "�L�q�q�I";
			mes "�L�[�q�q�q�q�q�I";
			next;
			mes "[�{���Z�u]";
			mes "���b�P���x���D�D�D!!";
			mes "���𗠐؂�������";
			mes "���A�K������������I";
			mes "��������Ă��I";
			mes "�L�[�q�q�q�q�q�I";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c";
			next;
			mes "[�{���Z�u]";
			mes "�����������b�P���x���̂��߂�";
			mes "���Ă�����������ʂ�";
			mes "���������ׂĔj��I�@���Ă��I";
			mes "�L�q�q�I�@������ɉ����";
			mes "�c���Ă����̂��I";
			next;
			mes "[�{���Z�u]";
			mes "��Ԃ�������ȃR�A�����̂�";
			mes "���O���|���Ă��ꂽ����ȃ@�B";
			mes "�L�q�q�q�q�I";
			next;
			mes "�]�ߎS�Ȏ����̍�����";
			mes "�@���b�P���x���Ђ������B";
			mes "�@�R�A�����̖̂\����j�~�������ƂŁA";
			mes "�@��������͊�@��Ƃꂽ�]";
			next;
			mes "�]�������A�{���Z�u���̂ċ��";
			mes "�@�������ȏ�A�ʂ̏ꏊ�ō����ߌ���";
			mes "�@�N���Ă���\��������B";
			mes "�@���b�P���x���Ђ̓����ɂ�";
			mes "�@���ӂ����ق����悳�������]";
			next;
			mes "[�{���Z�u]";
			mes "�����A�������c�c";
			mes "�R�A�����̂�r�����������낤�I";
			mes "�ȑO���������������ɁA���u�����";
			mes "�g���Ă����F������B";
			mes "���̒��̃K���N�^�������Ă����I";
			next;
			mes "[�{���Z�u]";
			mes "���ɂ͕K�v�Ȃ��������ȃ@�B";
			mes "�L�q�q�I";
			next;
			mes "[�{���Z�u]";
			mes "���b�P���x���ւ̕��Q��";
			mes "��`���Ă����Ȃ�A";
			mes "�܂����Ă���Ă��������H";
			mes "�L�[�q�q�q�q�I";
			next;
			mes "�]���b�P���x���{�Ёilhz_in01�j��";
			mes "�@�{���Z�u�̋��������i���W:43, 114�j";
			mes "�@�ɍs���Ă݂悤�]";
			for(set '@i,5113;'@i<5126;set '@i,'@i+1) {
				delquest '@quest;
			}
			chgquest 5126,72020;
			set LHZ_6QUE,9;
			close;
		}
		if(getonlinepartymember() < 1) {
			mes "[�{���Z�u]";
			mes "��l�Ō������ɃB�H";
			mes "�������̌x���V�X�e����";
			mes "���O���v���Ă���ق�";
			mes "�ȒP�ł͂ȁ[�[�[���I";
			mes "�L�q�q�q�q�I";
			next;
			mes "[�{���Z�u]";
			mes "�p�[�e�B�[��g��ł��Ȃ��Ă�";
			mes "����Ȃ����H�H";
			mes "�댯������ȃ@�c�c�B";
			close;
		}
		mes "[�{���Z�u]";
		mes "�L�q�q�c�c";
		mes "�p�ӂ͂��ׂďI�����̂��H";
		mes "���O���p�[�e�B�[���[�_�[�Ȃ�";
		mes "�������̓������J���悤�B";
		next;
		mes "[�{���Z�u]";
		mes "�c��̃R�A�����̂�";
		mes "����^0000ff" +'@total+ "��^000000�����H�I";
		next;
		switch(select("���ӂ��鎖�͂Ȃ����H","�R�A�����̂ɂ���","�������ɓ���","�������ɓ���Ȃ�")) {
		case 1:
			mes "[�{���Z�u]";
			mes "�����H�@�������ȃ@�c�c";
			mes "��������4���������āA";
			mes "�����̂̃{�X�́A��4�������ɂ���B";
			mes "�����Ȃ�A���ʂɂ��ǂ蒅���邪�A";
			mes "���͊Ǘ��V�X�e������펞�̃V�X�e����";
			mes "�؂�ւ���Ă���\��������B";
			next;
			mes "[�{���Z�u]";
			mes "�������{�^����";
			mes "�������܂�������ȃ@�c�c";
			mes "�L�q�A�L�q�q�q�I";
			next;
			mes "[�{���Z�u]";
			mes "��펞�̃V�X�e���ɐ؂�ւ����";
			mes "�����ꍇ�A�x���V�X�e�����쓮����";
			mes "�N���҂�r�����悤�ƏP��������B";
			mes "�C�����ȁH";
			next;
			mes "[�{���Z�u]";
			mes "���ꂩ��A��2��������";
			mes "�L�Q�ȃK�X���ʂ����p�C�v��";
			mes "���菄�炳��Ă���B";
			next;
			mes "[�{���Z�u]";
			mes "���̃p�C�v�̒��q���ŋ߈����Ăȃ@�B";
			mes "���͂��}�ɏ㏸���邱�Ƃ�����B";
			mes "�����Ȃ�����A��������O�ɁA";
			mes "�o���u���J����񂾁B";
			next;
			mes "[�{���Z�u]";
			mes "1�{2�{�Ȃ���Ȃ����A";
			mes "����ȏ㔚��������A�R�ꂽ�K�X��";
			mes "�������ɂ����Ȃ��Ȃ邩��ȃ@�H";
			close;
		case 2:
			mes "[�{���Z�u]";
			mes "�O�ɂ����������A";
			mes "�R�A�����͔̂��ɋ��͂����H�B";
			next;
			mes "[�{���Z�u]";
			mes "���̌������ł́A��x�ɕ�����";
			mes "�R�A�����̂��ڊo�߂Ȃ��悤";
			mes "�������������Ă��邪�A";
			mes "���ǂ����ڊo�߂Ă��邩��";
			mes "�m����@���Ȃ��B";
			next;
			mes "[�{���Z�u]";
			mes "�����c�c�R�A�R�A�����̂̂���6�̂́A";
			mes "�ȑO���猤������3�K�ɂ��o������̂�";
			mes "�m�F���Ă���B";
			next;
			mes "[�{���Z�u]";
			mes "�ǂ�����ĉ��̌���������";
			mes "�����o���Ă�̂��킩��˂����A";
			mes "�������œ|���Ă�����Ă��\��Ȃ����B";
			mes "�L�q�q�q�q�c�c";
			close;
		case 3:
			if(checkquest(5112)) {
				if(checkquest(5112) & 0x2 == 0) {
					mes "[�{���Z�u]";
					mes "�܂��������ɂ͓���Ȃ��B";
					mes "72���Ԍゾ�ƌ���������H�H";
					mes "��ł܂������B";
					mes "�L�q�q�q�q";
					close;
				}
				mes "[�{���Z�u]";
				mes "�L�q�A�L�q�q�c�c";
				mes "���O���R�A�����̑����";
				mes "��J���Ă���Ԃɒ��ׂ����c�c�B";
				next;
				mes "[�{���Z�u]";
				mes "�ЂЂД��{�^�����������ƁA";
				mes "�V�X�e����������������";
				mes "�d�g�݂ɂȂ��Ă��Ăȃ@�c�c�B";
				next;
				mes "[�{���Z�u]";
				mes "����ꂽ���Ԃ����������ɋ����Ȃ���";
				mes "��x����������o��ƁA�ēx�����";
				mes "�悤�ɂȂ�܂ŁA72���Ԃ��҂��Ȃ��Ă�";
				mes "�����Ȃ��Ȃ��Ă���B";
				next;
				mes "[�{���Z�u]";
				mes "�\�����~�߂�ɂ��A�������ɋ�����";
				mes "���Ԃ�����ȂɌ����Ă���񂶂�A";
				mes "������������ɍs���K�v������c�c�B";
				close;
			}
			if(getonlinepartymember() < 1) {
				mes "[�{���Z�u]";
				mes "�L�q�b�H";
				mes "�������̏o���Ǘ��V�X�e����";
				mes "���������B";
				mes "�����҂񂾂ȃ@�B";
				close;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�{���Z�u]";
				mes "^0000ff�p�[�e�B�[�̃��[�_�[^000000�ł͂Ȃ��ȁH";
				mes "���[�_�[��A��ė����I";
				close;
			}
			mdcreate "Worsef";
			mes "[�{���Z�u]";
			mes "�L�q�b�I";
			mes "�悵�A�������J���Ă�낤�I";
			next;
			mes "�]�{���Z�u��";
			mes "�@�����𑀍삵�n�߂��B�]";
			next;
			progressbar 2;
			mes "[�{���Z�u]";
			mes "�L�q�q�I�@�������̏o���Ǘ��V�X�e����";
			mes "^0000ff" +strcharinfo(1)+ "^000000�p�[�e�B�[�̃��[�_�[^0000ff" +strcharinfo(0)+ "^000000!!";
			mes "�m���ɓ��͂����B";
			next;
			mes "[�{���Z�u]";
			mes "����ł����̔�����";
			mes "�������ɓ��鎖���ł��邼�H�H";
			close;
		case 4:
			mes "[�{���Z�u]";
			mes "�����H";
			mes "�������܂��I���Ȃ��̂��H";
			close;
		}
	case 9:
		// ������
		mes "[�{���Z�u]";
		mes "�����A�������c�c";
		mes "�R�A�����̂�r�����������낤�I";
		mes "�ȑO���������������ɁA���u�����";
		mes "�g���Ă����F������B";
		mes "���̒��̃K���N�^�������Ă����I";
		next;
		mes "[�{���Z�u]";
		mes "���ɂ͕K�v�Ȃ��������ȃ@�B";
		mes "�L�q�q�I";
		next;
		mes "[�{���Z�u]";
		mes "���b�P���x���ւ̕��Q��";
		mes "��`���Ă����Ȃ�A";
		mes "�܂����Ă���Ă��������H";
		mes "�L�[�q�q�q�q�I";
		next;
		mes "�]���b�P���x���{�Ёilhz_in01�j��";
		mes "�@�{���Z�u�̋��������i���W:43, 114�j";
		mes "�@�ɍs���Ă݂悤�]";
		close;
	case 10:
		mes "[�{���Z�u]";
		mes "�܂������̂��@�H";
		mes "�L�q�q�c�c";
		next;
		mes "[�{���Z�u]";
		mes "���O���A������A�������ʂ�";
		mes "�j�󂵂悤�Ƃ��Ă����̂����c�c";
		mes "���O�����ׂē|�����͂���";
		mes "�R�A�����̂������A�܂�";
		mes "���A���A�Đ����n�߂₪�����񂾁c�c";
		next;
		mes "[�{���Z�u]";
		mes "���ׂẴR�A�����̂�|����";
		mes "�����͎~�܂�悤�Ƀv���O���������";
		mes "�����̂����A������ύX����Ă���";
		mes "�悤���c�c";
		mes "�L�q�A�L�q�q�q�q�c�c";
		next;
		mes "[�{���Z�u]";
		mes "�ȃ@�H";
		mes "�������ʂ̔j��̂��߁A";
		mes "�ēx�R�A�����̂�|���Ă���I";
		next;
		if(select("�f��","�����󂯂�") == 1) {
			mes "[�{���Z�u]";
			mes "�R�A�R�A�����̂��O�ɏo����A";
			mes "��ςȂ��ƂɂȂ邼�I";
			mes "���������͂ǂ��Ȃ��Ă�";
			mes "�m��Ȃ�����ȁI";
			mes "�L�q�q�q�q�c�c";
			close;
		}
		mes "[�{���Z�u]";
		mes "�L�q�b�I";
		mes "�������ɓ����悤";
		mes "�}����z���Ă��I";
		set LHZ_6QUE,11;
		close;
	default:
		mes "[������]";
		mes "�������H";
		mes "�����̎ז������I";
		close;
	}
}

lhz_dun04.gat,147,279,0	script	�������o����#memo	844,{
	if(LHZ_6QUE < 8) {
		mes "�]^0000FF****�l�̌�����";
		mes "�@�֌W�҈ȊO�̗�������֎~^000000�]";
		close;
	}
	if(checkquest(5112)) {
		if(checkquest(5112) & 0x2) {
			mes "[�o���Ǘ��V�X�e��]";
			mes strcharinfo(0)+ "�c�c";
			mes "^FF0000�ڋߋ��ۂ���������܂����B^000000";
			delquest 5112;
			close;
		}
		mes "[�o���Ǘ��V�X�e��]";
		mes "�r�[�r�[�r�[�I";
		mes strcharinfo(0)+ "�c�c";
		mes "^FF0000�ڋߋ��ۑΏۂł��B^000000";
		next;
		mes "�]�o���Ǘ��V�X�e����";
		mes "�@�������ڋ߂����ۂ����]";
		close;
	}
	mes "�]�{���Z�u�������ɓ�������B";
	mes "�@���̌���������A�Q�������O��";
	mes "�@�������Ԑ��̂悤�ɕ������ė���]";
	next;
	if(select("�������ɓ���","����Ȃ�") == 2) {
		mes "�]�{���Z�u�̌�������";
		mes "�@����̂���߂��]";
		close;
	}
	if(mdenter("Worsef") != 0) {
		mes "[�o���Ǘ��V�X�e��]";
		mes "^FF0000�x��^000000";
		mes strcharinfo(0)+ "�c�c";
		mes "^FF0000�o�^����ĂȂ��g�p��^000000";
		next;
		pushpc 8,10;
		misceffect 131;
		misceffect 16,"";
		percentheal -5,0;
		mes "�]�o���Ǘ��V�X�e������U������";
		mes "�@���Ȃ��͉���������]";
		close;
	}
	setquest 5112;
	set WORSEF_1QUE,0;
	donpcevent getmdnpcname("1������#1_1") +"::OnStart";
	announce "�������̏o���Ǘ��V�X�e��[" +strcharinfo(1)+ "]�g�p��[" +strcharinfo(0)+ "]�l�̏o�����c�c",0x9,0x0df297;
	close;
}

1@lhz.gat,45,148,0	script	1������#1_1	139,1,1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("����#1_1");
	hideonnpc getmdnpcname("�o���u#1_2");
	hideonnpc getmdnpcname("�o���u#1_3");
	hideonnpc getmdnpcname("#escape1");
	hideonnpc getmdnpcname("#escape2");
	hideonnpc getmdnpcname("#potal_01");
	hideonnpc getmdnpcname("#potal_02");
	hideonnpc getmdnpcname("#potal_03");
	hideonnpc getmdnpcname("�{���Z�u#last");
	end;
OnStart2:
	announce "�x���V�X�e�� : �ۈ��V�X�e����~�ɔ����A�o�����̊J�͎蓮�ōs���Ă��������B", 0x9, 0xff9977;
	misceffect 348,getmdnpcname("����#1_1");
	hideoffnpc getmdnpcname("����#1_1");
	misceffect 348,getmdnpcname("�o���u#1_2");
	hideoffnpc getmdnpcname("�o���u#1_2");
	misceffect 348,getmdnpcname("�o���u#1_3");
	hideoffnpc getmdnpcname("�o���u#1_3");
	end;
OnTouch:
	initnpctimer;
	hideonnpc getmdnpcname("1������#1_1");
	end;
OnTimer1000:
	announce "�x���V�X�e�� : �x�����܂��B�x�����܂��B�N���Ҋ��m�I",0x9,0xff9977;
	end;
OnTimer4000:
	announce "�x���V�X�e�� : 5�b��ɑ�1�������ۈ��V�X�e�����ғ����܂��B",0x9,0xff9977;
	end;
OnTimer9000:
	stopnpctimer;
	donpcevent getmdnpcname("MobCtrl1#mob01") +"::OnStart";
	end;
}

1@lhz.gat,1,1,0	script	MobCtrl1#mob01	139,{
OnStart:
	announce "�x���V�X�e�� : �ۈ��V�X�e���ғ�!!�@�����������J������܂��B�֌W�҂͑ޔ����Ă��������B",0x9,0xff9977;
	areamonster getmdmapname("1@lhz.gat"),36,156,53,169,"�Q������������",2242,11,getmdnpcname("MobCtrl1#mob01")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	end;
OnTimer1000:
	set '@count,getmapmobs(getmdmapname("1@lhz.gat"),getmdnpcname("MobCtrl1#mob01")+ "::OnKilled");
	if('@count == 0) {
		announce "�x���V�X�e�� : ��1�������̕ۈ��V�X�e������~���܂����B", 0x9, 0xff9977;
		donpcevent getmdnpcname("1������#1_1") +"::OnStart2";
	}
	end;
}

1@lhz.gat,39,168,0	script	����#1_1	844,{
	mes "�]���ނ��΂�܂���Ă���B";
	mes "�@�ۈ��V�X�e������~�����ۂ�";
	mes "�@�o�����̑���}�j���A���̂悤���]";
	next;
	mes "�]�}�j���A���ɂ��ƁA�蓮�ŏo������";
	mes "�@�J�����߂ɂ́A�o���u�����܂���";
	mes "�@���Ԃő��삷��K�v������悤���]";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�o���u�̑���̓p�[�e�B�[��";
		mes "�@���[�_�[�ɔC���Ă����܂��傤�]";
		close;
	}
	mes "�]�p�[�e�B�[�̃��[�_�[�ł���";
	mes "�@���Ȃ��́A����ɓ��e��ǂݐi�߂��]";
	next;
	mes "[���o���o���u�̑�����@]";
	if(WORSEF_1QUE == 0)
		set WORSEF_1QUE,rand(1,6);
	switch(WORSEF_1QUE) {
	case 1:
		mes "���삷��o���u�F���o���u";
		mes "�񂷕����F�E2���A��1���A�E1��";
		break;
	case 2:
		mes "���삷��o���u�F���o���u";
		mes "�񂷕����F�E1���A��2���A�E1��";
		break;
	case 3:
		mes "���삷��o���u�F���o���u";
		mes "�񂷕����F�E1���A��1���A�E2��";
		break;
	case 4:
		mes "���삷��o���u�F�E�o���u";
		mes "�񂷕����F��2���A�E1���A��1��";
		break;
	case 5:
		mes "���삷��o���u�F�E�o���u";
		mes "�񂷕����F��1���A�E2���A��1��";
		break;
	case 6:
		mes "���삷��o���u�F�E�o���u";
		mes "�񂷕����F��1���A�E1���A��2��";
		break;
	}
	close;
}
1@lhz.gat,41,172,0	script	�o���u#1_2	844,{
	mes "�]�u���o���p�i���o���u�j�v��";
	mes "�@�����ꂽ�o���u������B";
	mes "�@�蓮�ŏo�������J����ۂ�";
	mes "�@�g�p�����o���u�̂悤���]";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�o���u�̑���́A�p�[�e�B�[��";
		mes "�@���[�_�[�ɔC���悤�]";
		close;
	}
	mes "�]�ǂ̕����ɉ񂵂܂����H�]";
	for(set '@i,1; '@i <= 4; set '@i,'@i+1) {
		next;
		switch(select("�E","��")) {
		case 1:
			if (('@i == 1 || '@i == 4) || ('@i == 2 && WORSEF_1QUE == 1) || ('@i == 3 && WORSEF_1QUE == 3)) {
				set '@success,'@success + 1;
			}
			break;
		case 2:
			if (('@i == 2 && WORSEF_1QUE != 1) || ('@i == 3 && WORSEF_1QUE != 3)) {
				set '@success,'@success + 1;
			}
			break;
		}
		if('@success == 4) {
			mes "�]�M�B�B�[�]";
			announce "�Ǘ��V�X�e�� : ��2�������Ɍ����������J����܂����B", 0x9, 0x7799ff;
			hideoffnpc "#potal_01";
			set WORSEF_1QUE,0;
			close;
		}
		if('@i == 4) {
			mes "�]�M�B�[";
			mes "�@";
			mes "�@�o���u���񂵂����A";
			mes "�@�����N���Ȃ������]";
			next;
			mes "�]������x�A���ނ𒲂ׂ�";
			mes "�@����K�v�����肻�����]";
			close;
		}
		mes "�]�M�B�B�[";
		mes "�@";
		mes "�@���͂ǂ̕����ɉ񂵂܂����H�]";
		continue;
	}
}
1@lhz.gat,52,172,0	script	�o���u#1_3	844,{
	mes "�]�u���o���p�i�E�o���u�j�v��";
	mes "�@�����ꂽ�o���u������B";
	mes "�@�蓮�ŏo�������J����ۂ�";
	mes "�@�g�p�����o���u�̂悤���]";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�o���u�̑���́A�p�[�e�B�[��";
		mes "�@���[�_�[�ɔC���悤�]";
		close;
	}
	mes "�]�ǂ̕����ɉ񂵂܂����H�]";
	for(set '@i,0;'@i<4;set '@i,'@i+1) {
		next;
		switch(select("�E","��")) {
		case 1:
			if(('@i == 2 && WORSEF_1QUE != 4) || ('@i == 3 && WORSEF_1QUE != 6)) {
				set '@success,'@success + 1;
			}
			break;
		case 2:
			if(('@i == 1 || '@i == 4) || ('@i == 2 && WORSEF_1QUE == 4) || ('@i == 3 && WORSEF_1QUE == 6)) {
				set '@success,'@success + 1;
			}
			break;
		}
		if('@success == 4) {
			mes "�]�M�B�B�[�]";
			announce "�Ǘ��V�X�e�� : ��2�������Ɍ����������J����܂����B",0x9,0x7799ff;
			hideoffnpc "#potal_01";
			set WORSEF_1QUE,0;
			close;
		}
		if('@i == 4) {
			mes "�]�M�B�[";
			mes "�@";
			mes "�@�o���u���񂵂����A";
			mes "�@�����N���Ȃ������]";
			next;
			mes "�]������x�A���ނ𒲂ׂ�";
			mes "�@����K�v�����肻�����]";
			close;
		}
		mes "�]�M�B�B�[";
		mes "�@";
		mes "�@���͂ǂ̕����ɉ񂵂܂����H�]";
		continue;
	}
}

1@lhz.gat,45,173,0	warp	#potal_01	2,2,1@lhz.gat,151,29

1@lhz.gat,151,29,0	script	#2_0	139,1,1,{
	donpcevent getmdnpcname("2������#2_1")+"::OnStart";
	hideonnpc getmdnpcname("#2_0");
	end;
}

1@lhz.gat,1,2,0	script	2������#2_1	139,{
OnStart:
	initnpctimer;
	end;
OnStart2:
	announce "�Ǘ��V�X�e�� : ��3�������Ɍ����������J���܂����B",0x9,0x7799ff;
	hideoffnpc getmdnpcname("#potal_02");
	stopnpctimer;
	end;
OnTimer1000:
	announce "�x���V�X�e�� : �x���I�@�x���I�@��2�������ɐN���҂����m!!",0x9,0xff9977;
	end;
OnTimer3000:
	announce "�x���V�X�e�� : 5�b��ɑ�2�������ۈ��V�X�e�����ғ����܂��B",0x9,0xff9977;
	end;
OnTimer8000:
	announce "�x���V�X�e�� : 1���ۈ��V�X�e���ғ�!!�@�֌W�҂͑ޔ����Ă��������B",0x9,0xff9977;
	donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnStart";
	end;
OnTimer12000:
	announce "�Ǘ��V�X�e�� : �x���I�@��2�������p�C�v�̈��͂����܂�ɂ������ł��B",0x9,0x7799ff;
	end;
OnTimer15000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer135000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer255000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer375000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer495000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer615000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer735000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	end;
OnTimer855000:
	donpcevent getmdnpcname("2������#2_2")+"::OnStart";
	stopnpctimer;
	end;
}

1@lhz.gat,1,3,0	script	2������#2_2	139,{
OnStart:
	switch(rand(1,6)) {
	case 1:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��1�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��1�o���u#2_1")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_01";
		break;
	case 2:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��2�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��2�o���u#2_2")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_02";
		break;
	case 3:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��3�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��3�o���u#2_3")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_03";
		break;
	case 4:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��4�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��4�o���u#2_4")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_04";
		break;
	case 5:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��5�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��5�o���u#2_5")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_05";
		break;
	case 6:
		announce "�Ǘ��V�X�e�� : �x���I�@�p�C�v�̈��͂������ł��B��6�o���u���J���ĉ������B",0x9,0x7799ff;
		donpcevent getmdnpcname("��6�o���u#2_6")+"::OnStart";
		donpcevent getmdnpcname("MobCtrl2#mob02")+"::OnSpawn_06";
		break;
	}
	initnpctimer;
	end;
OnTimer63000:
	stopnpctimer;
	set 'flag,'flag + 1;
	if('flag == 3) {
		donpcevent getmdnpcname("#2_3")+"::OnStart";
	}
	else {
		announce "�Ǘ��V�X�e�� : �p�C�v���j���m�I�@���ꂩ��"+ (3 - 'flag) +"���j���A�����E�o���u���N�����܂��B",0x9,0x7799ff;
	}
	for(set '@i,1; '@i <= 6; set '@i,'@i+1) {
		misceffect 16, "��" +'@i+ "�o���u#2_" +'@i;
	}
	end;
OnStop:
	stopnpctimer;
	end;
}

1@lhz.gat,1,4,0	script	MobCtrl2#mob02	139,{
OnStart:
	set 'lv,1;
	setarray 'mob[1],10,20,16,19,20;
	areamonster getmdmapname("1@lhz.gat"),139,37,164,58,"�Q������������",2242,'mob[lv],getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@lhz.gat"),getmdnpcname("MobCtrl2#mob02")+ "::OnKilled");
	if('@count > 0)
		end;
	set 'lv,'lv + 1;
	if('lv == 6) {
		announce "�x���V�X�e�� : ��2�������̕ۈ��V�X�e������~���܂����B",0x9,0xff9977;
		donpcevent getmdnpcname("2������#2_1")+"::OnStart2";
		donpcevent getmdnpcname("2������#2_2")+"::OnStop";
	}
	else {
		initnpctimer;
		announce "�x���V�X�e�� : 5�b���" +'lv+ "���ۈ��V�X�e�����ғ����܂��B",0x9,0xff9977;
	}
	end;
OnTimer5000:
	stopnpctimer;
	announce "�x���V�X�e�� : " +'lv+ "���ۈ��V�X�e���ғ�!!�@�֌W�҂͑ޔ����ĉ������B",0x9,0xff9977;
	areamonster getmdmapname("1@lhz.gat"),139,37,164,58,"�Q������������",2242,'mob[lv],getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_01:
	areamonster getmdmapname("1@lhz.gat"),155,43,161,49,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_02:
	areamonster getmdmapname("1@lhz.gat"),137,40,143,46,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_03:
	areamonster getmdmapname("1@lhz.gat"),137,51,143,57,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_04:
	areamonster getmdmapname("1@lhz.gat"),143,56,149,62,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_05:
	areamonster getmdmapname("1@lhz.gat"),160,48,166,54,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
OnSpawn_06:
	areamonster getmdmapname("1@lhz.gat"),135,44,141,50,"�Q������������",2243,5,getmdnpcname("MobCtrl2#mob02")+"::OnKilled";
	end;
}

1@lhz.gat,151,53,0	script	#2_3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "�Ǘ��V�X�e�� : �V�X�e����~�I�@�V�X�e����~�I�@10�b��Ɍ������̊O�ɒE�o�o�H���J���܂��B",0x9,0x7799ff;
	end;
OnTimer11000:
	announce "�Ǘ��V�X�e�� : �E�o���Ă�������!!",0x9,0x7799ff;
	hideoffnpc getmdnpcname("#escape1");
	hideoffnpc getmdnpcname("#escape2");
	end;
}

1@lhz.gat,46,158,0	script	#escape1	139,20,20,{
	warp "lhz_dun04.gat",147,273;
	end;
}

1@lhz.gat,151,38,0	script	#escape2	139,20,20,{
	warp "lhz_dun04.gat",147,273;
	end;
}

1@lhz.gat,158,46,0	script	��1�o���u#2_1	844,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0) || 'active <= 0) {
		mes "�]�����̃o���u�𑀍삷��K�v�͂Ȃ��]";
		close;
	}
	progressbar 20;
	stopnpctimer;
	donpcevent getmdnpcname("2������#2_2")+"::OnStop";
	end;
OnStart:
	set 'active,20;
	initnpctimer;
	end;
OnTimer3000:
	misceffect 373;
	stopnpctimer;
	if('active) {
		set 'active,'active - 1;
		initnpctimer;
	}
	end;
}

1@lhz.gat,138,43,0	duplicate(��1�o���u#2_1)	��2�o���u#2_2	844
1@lhz.gat,139,54,0	duplicate(��1�o���u#2_1)	��3�o���u#2_3	844
1@lhz.gat,145,60,0	duplicate(��1�o���u#2_1)	��4�o���u#2_4	844
1@lhz.gat,165,51,0	duplicate(��1�o���u#2_1)	��5�o���u#2_5	844
1@lhz.gat,137,47,0	duplicate(��1�o���u#2_1)	��6�o���u#2_6	844

1@lhz.gat,151,64,0	warp	#potal_02	2,2,1@lhz.gat,84,28

1@lhz.gat,84,28,0	script	#3_0	139,1,1,{
	donpcevent getmdnpcname("3������#3_1")+"::OnStart";
	hideonnpc getmdnpcname("#3_0");
	end;
}

1@lhz.gat,1,5,0	script	3������#3_1	139,{
OnStart:
	initnpctimer;
	end;
OnStart2:
	announce "�Ǘ��V�X�e�� : ��4�������Ɍ����������J���܂����B",0x9,0x7799ff;
	hideoffnpc getmdnpcname("#potal_03");
	end;
OnTimer1000:
	announce "�x���V�X�e�� : �x���I�@�x���I",0x9,0xff9977;
	end;
OnTimer5000:
	announce "�x���V�X�e�� : ��3�������ɐN���Ҋ��m!!",0x9,0xff9977;
	end;
OnTimer7000:
	announce "�x���V�X�e�� : 5�b��ɑ�3�������̕ۈ��V�X�e�����ғ����܂��B",0x9,0xff9977;
	end;
OnTimer12000:
	announce "�x���V�X�e�� : ��3��������1���ۈ��V�X�e���ғ�!!�@�֌W�҂͑ޔ����Ă��������B",0x9,0xff9977;
	donpcevent getmdnpcname("MobCtrl3#mob03")+"::OnStart";
	stopnpctimer;
	end;
}

1@lhz.gat,1,6,0	script	MobCtrl3#mob03	139,{
OnStart:
	set 'lv,1;
	set '@map$,getmdmapname("1@lhz.gat");
	set '@label$,getmdnpcname("MobCtrl3#mob03")+"::OnKilled";
	monster '@map$,80,60,"�Q������������",2242,1,'@label$;
	monster '@map$,82,60,"�Q������������",2242,1,'@label$;
	monster '@map$,84,60,"�Q������������",2243,1,'@label$;
	monster '@map$,86,60,"�Q������������",2242,1,'@label$;
	monster '@map$,81,58,"�Q������������",2242,1,'@label$;
	monster '@map$,83,58,"�Q������������",2243,1,'@label$;
	monster '@map$,85,58,"�Q������������",2242,1,'@label$;
	monster '@map$,87,58,"�Q������������",2242,1,'@label$;
	monster '@map$,82,56,"�Q������������",2243,1,'@label$;
	monster '@map$,85,56,"�Q������������",2242,1,'@label$;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@lhz.gat"),getmdnpcname("MobCtrl3#mob03")+ "::OnKilled");
	if('@count > 0)
		end;
	set 'lv,'lv + 1;
	if('lv == 6) {
		announce "�x���V�X�e�� : ��3�������̕ۈ��V�X�e������~���܂����B",0x9,0xff9977;
		donpcevent getmdnpcname("3������#3_1")+"::OnStart2";
	}
	else {
		initnpctimer;
		announce "�x���V�X�e�� : 5�b���" +'lv+ "���ۈ��V�X�e�����ғ����܂��B",0x9,0xff9977;
	}
	end;
OnTimer5000:
	stopnpctimer;
	announce "�x���V�X�e�� : " +'lv+ "���ۈ��V�X�e���ғ�!!�@�֌W�҂͑ޔ����ĉ������B",0x9,0xff9977;
	set '@map$,getmdmapname("1@lhz.gat");
	set '@label$,getmdnpcname("MobCtrl3#mob03")+"::OnKilled";
	monster '@map$,80,60,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,82,60,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,84,60,"�Q������������",2243,rand(1,5),'@label$;
	monster '@map$,86,60,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,81,58,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,83,58,"�Q������������",2243,rand(1,5),'@label$;
	monster '@map$,85,58,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,87,58,"�Q������������",2242,rand(1,5),'@label$;
	monster '@map$,82,56,"�Q������������",2243,rand(1,5),'@label$;
	monster '@map$,85,56,"�Q������������",2242,rand(1,5),'@label$;
	end;
}

1@lhz.gat,83,62,0	warp	#potal_03	2,2,1@lhz.gat,137,100

1@lhz.gat,137,100,0	script	#4_0	139,1,1,{
	donpcevent getmdnpcname("4������#4_1")+"::OnStart";
	hideonnpc getmdnpcname("#4_0");
	end;
}

1@lhz.gat,1,7,0	script	4������#4_1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "���� : �N�͒N���c�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss01";
	end;
OnTimer2000:
	misceffect 72,"Worsef_boss02";
	end;
OnTimer3000:
	announce "���� : ����ȏ�ߊ��ȁc�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss03";
	end;
OnTimer4000:
	misceffect 72,"Worsef_boss04";
	end;
OnTimer5000:
	announce "���� : �����͊댯���c�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss05";
	end;
OnTimer6000:
	misceffect 72,"Worsef_boss06";
	end;
OnTimer7000:
	announce "���� : �����ďo�Ă����Ȃ��c�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss07";
	end;
OnTimer8000:
	misceffect 72,"Worsef_boss08";
	end;
OnTimer9000:
	announce "���� : �������̂悤�ɂȂ肽���Ȃ��Ȃ�c�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss09";
	end;
OnTimer10000:
	misceffect 72,"Worsef_boss10";
	end;
OnTimer11000:
	announce "���� : �����ɗ����c�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss11";
	end;
OnTimer12000:
	misceffect 72,"Worsef_boss12";
	end;
OnTimer13000:
	announce "���� : �߂��݂ƒɂ݂������𖞂����O�Ɂc�c",0x9,0x7dcbf0;
	misceffect 72,"Worsef_boss13";
	end;
OnTimer17000:
	announce "���� : ���c�c���c�c�����x���c�c",0x9,0x7dcbf0;
	donpcevent getmdnpcname("MobCtrl4#mob04")+"::OnStart";
	stopnpctimer;
	end;
}

1@lhz.gat,1,8,0	script	MobCtrl4#mob04	139,{
OnStart:
	set 'mvp,rand(1,13);
	if('mvp > 9) {
		misceffect 183,getmdnpcname("Worsef_boss" +'mvp);
		hideonnpc getmdnpcname("Worsef_boss" +'mvp);
	}
	else {
		misceffect 183,getmdnpcname("Worsef_boss0" +'mvp);
		hideonnpc getmdnpcname("Worsef_boss0" +'mvp);
	}
	set '@map$,getmdmapname("1@lhz.gat");
	set '@label$,getmdnpcname("MobCtrl4#mob04")+"::OnKilled";
	switch('mvp) {
	case 1:
		monster '@map$,129,154,"�Z�C����=�E�B���U�[",1646,1,'@label$;
		break;
	case 2:
		monster '@map$,125,150,"�Z�V��=�f�B����",1650,1,'@label$;
		break;
	case 3:
		monster '@map$,121,146,"�K�[�e�B�[=�E�[",2239,1,'@label$;
		break;
	case 4:
		monster '@map$,117,142,"�G�����X=�K�C��",1647,1,'@label$;
		break;
	case 5:
		monster '@map$,117,125,"�g�����e�B�[�j",2241,1,'@label$;
		break;
	case 6:
		monster '@map$,121,121,"�`�F��=���E",2238,1,'@label$;
		break;
	case 7:
		monster '@map$,125,117,"�A���t�H�V�I=�o�W��",2240,1,'@label$;
		break;
	case 8:
		monster '@map$,129,113,"�G�~���[��=�v�����[��",2236,1,'@label$;
		break;
	case 9:
		monster '@map$,146,113,"�����f��=�������X",2235,1,'@label$;
		break;
	case 10:
		monster '@map$,150,117,"�Z���A=�A���f",2237,1,'@label$;
		break;
	case 11:
		monster '@map$,154,121,"�J�g���[�k=�P�C����",1651,1,'@label$;
		break;
	case 12:
		monster '@map$,158,125,"�}�[�K���b�^=�\����",1649,1,'@label$;
		break;
	case 13:
		monster '@map$,158,142,"�n���[�h=�A���g�A�C�[��",1648,1,'@label$;
		break;
	}
	end;
OnKilled:
	switch('mvp) {
	case 1:		// �Z�C����=�E�B���U�[
		announce "�����c�c�F�A�������c�c����Ă��܂����̂��c�c�H",0x9,0xfd3b02;
		break;
	case 2:		// �Z�V��=�f�B����
		announce "�|���I�@�N�ł���������c�c�����肢�c�c�I",0x9,0xfd3b02;
		break;
	case 3:		// �K�[�e�B�[=�E�[
		announce "�����c�c���f��������́c�c�Ȃ������񂾂��ǁA�ˁc�c",0x9,0xfd3b02;
		break;
	case 4:		// �G�����X=�K�C��
		announce "�`�b�c�c���̑����~�߂���Ȃ�Ăȁc�c",0x9,0xfd3b02;
		break;
	case 5:		// �g�����e�B�[�j
		announce "������x�c�c�y�����̂��āc�c���̂����c�c���ǁA���āc�c",0x9,0xfd3b02;
		break;
	case 6:		// �`�F��=���E
		announce "���c�c���߂�c�c���̂����Łc�c",0x9,0xfd3b02;
		break;
	case 7:		// �A���t�H�V�I=�o�W��
		announce "�g�����e�B�[�j�c�c�V�����c�c��Ȃ����̂��c�c���Ɂc�c",0x9,0xfd3b02;
		break;
	case 8:		// �G�~���[��=�v�����[��
		announce "�͂��c�c�V�����J�������|�[�V�����c�c�������������Ȃ��c�c",0x9,0xfd3b02;
		break;
	case 9:		// �����f��=�������X
		announce "�ȁA���Ԃ������c�c���Ȃ���΁c�c���I",0x9,0xfd3b02;
		break;
	case 10:	// �Z���A=�A���f
		announce "�c�c���́A�����c�c�́A�~�߂Ȃ��Ɓc�c",0x9,0xfd3b02;
		break;
	case 11:	// �J�g���[�k=�P�C����
		announce "�����c�c�ǂ����c�c�݂�Ȗ����Łc�c",0x9,0xfd3b02;
		break;
	case 12:	// �}�[�K���b�^=�\����
		announce "�����Ȃ��Łc�c���c�c�I�[�f�B���l�c�c���������c�c",0x9,0xfd3b02;
		break;
	case 13:	// �n���[�h=�A���g�A�C�[��
		announce "�o����c�c������x�c�c������c�c",0x9,0xfd3b02;
		break;
	}
	hideoffnpc getmdnpcname("�{���Z�u#last");
	end;
}

1@lhz.gat,127,156,5	script	�Z�C����=�E�B���U�[::Worsef_boss01	1646,{}
1@lhz.gat,123,152,5	script	�Z�V��=�f�B����::Worsef_boss02	1650,{}
1@lhz.gat,119,148,5	script	�K�[�e�B�[=�E�[::Worsef_boss03	2239,{}
1@lhz.gat,115,144,5	script	�G�����X=�K�C��::Worsef_boss04	1647,{}
1@lhz.gat,115,123,7	script	�g�����e�B�[�j::Worsef_boss05	2241,{}
1@lhz.gat,119,119,7	script	�`�F��=���E::Worsef_boss06	2238,{}
1@lhz.gat,123,115,7	script	�A���t�H�V�I=�o�W��::Worsef_boss07	2240,{}
1@lhz.gat,127,111,7	script	�G�~���[��=�v�����[��::Worsef_boss08	2236,{}
1@lhz.gat,148,111,1	script	�����f��=�������X::Worsef_boss09	2235,{}
1@lhz.gat,152,115,1	script	�Z���A=�A���f::Worsef_boss10	2237,{}
1@lhz.gat,156,119,1	script	�J�g���[�k=�P�C����::Worsef_boss11	1651,{}
1@lhz.gat,160,123,1	script	�}�[�K���b�^=�\����::Worsef_boss12	1649,{}
1@lhz.gat,160,144,3	script	�n���[�h=�A���g�A�C�[��::Worsef_boss13	1648,{}

1@lhz.gat,137,156,7	script	�{���Z�u#last	865,{
	mes "[�{���Z�u]";
	mes "�������������̊O�ɏo��̂��H";
	next;
	if(select("�o�Ȃ�","�o��") == 1) {
		mes "[�{���Z�u]";
		mes "�L�q�q";
		mes "�o�����Ȃ����琺�������Ă���B";
		close;
	}
	mes "[�{���Z�u]";
	mes "�L�q�q";
	mes "�킩�����A�������̊O�ɏo���Ă��B";
	close2;
	warp "lhz_dun04.gat",147,273;
	end;
}