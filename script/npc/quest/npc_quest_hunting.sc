//= Auriga Script ==============================================================
// Ragnarok Online Hunting Quest Script	by Blaze
//= Registry ===================================================================
// HUNT_QUE -> 0�`
//==============================================================================
prontera.gat,122,53,3	script	�������@����#Hunt_Prt	951,{
	if(BaseLevel < 70) {
		mes "[�������@����]";
		mes "���`�ށc�c";
		mes "�Ȃ��Ȃ��ǂ���ނ�";
		mes "�`���҂��������Ȃ��ȁB";
		mes "�ǂ��������̂��c�c";
		next;
		mes "[�������@����]";
		mes "��H�@�M�N�������֎Q���������̂��H";
		mes "�M�N�̋C�����͂��肪������";
		mes "���܂̋M�N�ł͂܂�";
		mes "�͕s���̂悤�Ɍ�����B";
		mes "^FF0000���߂āABaseLv��70�ȏ�";
		mes "����΂ȁc�c^000000";
		close;
	}
	switch(HUNT_QUE) {
	case 0:
		emotion 9;
		mes "[�������@����]";
		mes "���`�ށc�c";
		mes "�Ȃ��Ȃ��ǂ���ނ�";
		mes "�`���҂��������Ȃ��ȁB";
		mes "�ǂ��������̂��c�c";
		next;
		emotion 0;
		mes "[�������@����]";
		mes "��!?�@�����̌N�I";
		mes "�����M�N���B";
		mes "�N�͒��X�̎��͂�";
		mes "�������`���҂̂悤���ȁI";
		mes "���܂Ȃ����A���̘b�𕷂��Ă���I";
		next;
		mes "[�������@����]";
		mes "���ȏЉ�܂��������ȁB";
		mes "���̖��́u�N���X�E�R�����v���B";
		mes "�C�y�Ɂu�N���X�v�ƌĂ�ł���B";
		next;
		mes "[�N���X]";
		mes "�����ƁA�b�����ꂽ�ȁB";
		mes "���́A�ߔN������Ƃ����";
		mes "�����X�^�[�B�̍s��������������";
		mes "�X�̐l�X�̐�����";
		mes "���������˂Ȃ��󋵂Ȃ̂��I";
		next;
		emotion 16;
		mes "[�N���X]";
		mes "���́A���̏󋵂�ŊJ����ׂ��A";
		mes "�l�X�ȃ����X�^�[�𓢔�����";
		mes "���𑱂��Ă����̂����A";
		mes "��͂��l�ł͌��E���������c�c";
		next;
		mes "[�N���X]";
		mes "�����ŁA���܂͊e�n�������Ȃ���";
		mes "�M�N�̂悤�Ȏ��͂̂���`���҂�";
		mes "���������Ă���̂��B";
		next;
		emotion 1;
		mes "[�N���X]";
		mes "�M�N�قǎ��͂��������`���҂�";
		mes "���͂��Ă����΁A���ɐS�����B";
		mes "�ǂ����H�@�M�N�����͂��Ă���ʂ��H";
		next;
		if(select("���͂��܂��傤","�������Ă��܂�") == 2) {
			emotion 74;
			mes "[�N���X]";
			mes "�������c�c";
			mes " ";
			mes "�C�����������";
			mes "�܂����������Ă���B";
			close;
		}
		emotion 15;
		mes "[�N���X]";
		mes "�{�������I";
		mes "�M�N�Ȃ炻�������Ă�����";
		mes "�v���Ă������I";
		next;
		emotion 28;
		mes "[�N���X]";
		mes "�Ȃ��Ȃ����͂��Ă����҂�";
		mes "�W�܂�Ȃ��Ăȁc�c";
		mes "�����΂���C��";
		mes "�œ����Ă����Ƃ���c�c";
		next;
		emotion 23;
		mes "[�N���X]";
		mes "�n�b�c�I";
		mes "����I�@�ȁA�Ȃ�ł��Ȃ��I";
		mes " ";
		mes "�R�A�R�z���b�B";
		mes "�́A�b�𑱂��邼�I";
		next;
		mes "[�N���X]";
		mes "�����Ώۂ̏ڍׂɂ��Ă�";
		mes "���̉��ɂ���⍲������";
		mes "�b�𕷂��Ă���B";
		next;
		mes "[�N���X]";
		mes "�����āA����������������A";
		mes "���܂ŕ񍐂��Ă���B";
		mes " ";
		mes "�킸���ł͂��邪�A";
		mes "�S�΂���̗�����悤�B";
		next;
		emotion 21;
		mes "[�N���X]";
		mes "����ł́A�M�N�̍K�^���F��B";
		set HUNT_QUE,1;
		close;
	case 1:
		mes "[�N���X]";
		mes "�b�́A���ɂ���⍲������";
		mes "�����Ă���B";
		close;
	case 2:
		if(BaseLevel < 70) {
			mes "[�������@����]";
			mes "��H�@�M�N�͓�������";
			mes "���͂��Ă���Ă���҂ł͂Ȃ����B";
			mes "�������ʂ����ɁA���X�͂�";
			mes "��܂��Ă���悤���ȁB";
			next;
			mes "[�������@����]";
			mes "�����֎Q������ɂ�";
			mes "^FF0000BaseLv70�ȏ�^000000�łȂ���";
			mes "���������낤�B";
			mes "���܂Ȃ����ABaseLv���グ�Ă���";
			mes "�܂����Ă���B";
			close;
		}
		for(set '@queid,106700; '@queid < 107000; set '@queid,'@queid+1) {
			if(checkquest('@queid)&4) {
				emotion 5;
				mes "[�N���X]";
				mes "�����A�M�N���I";
				mes "�Ȃ��Ȃ��߂��Ă��Ȃ�����";
				mes "�S�z���Ă������I";
				mes " ";
				mes "���̗l�q���Ɩ���";
				mes "�����͏I������悤���ȁB";
				next;
				mes "[�N���X]";
				mes "���āA�񑩒ʂ�";
				mes "�S�΂���̗�Ƃ���";
				mes "�M�N�Ɍo���l��t�^���悤�B";
				next;
				mes "[�N���X]";
				mes "�o���l�́ABase�o���l��";
				mes "Job�o���l����I�Ԃ��Ƃ��ł��邼�B";
				next;
				emotion 1;
				mes "[�N���X]";
				mes "�M�N�́A�ǂ���ɂ���񂾁H";
				next;
				if(select("Base�o���l�����炤","Job�o���l�����炤") == 1) {
					if(checkre()) {
						if(Upper != UPPER_HIGH && Class < CLASS_RK)
							getexp 500000,0;
						else if(Class < CLASS_RK)
							getexp 1000000,0;
						else
							getexp 3000000,0;
					}
					else {
						if(Upper != UPPER_HIGH && Class < CLASS_RK)
							getexp 5000000,0;
						else if(Class < CLASS_RK)
							getexp 10000000,0;
						else
							getexp 30000000,0;
					}
				}
				else {
					if(checkre()) {
						if(Upper != UPPER_HIGH && Class < CLASS_RK)
							getexp 0,250000;
						else if(Class < CLASS_RK)
							getexp 0,500000;
						else
							getexp 0,1500000;
					}
					else {
						if(Upper != UPPER_HIGH && Class < CLASS_RK)
							getexp 0,2500000;
						else if(Class < CLASS_RK)
							getexp 0,5000000;
						else
							getexp 0,15000000;
					}
				}
				delquest '@queid;
				mes "[�N���X]";
				mes "�悵�I�@����ő��v���B";
				mes " ";
				mes "�M�N�����͂��Ă���Ă�Ƃ͂���";
				mes "�܂��܂������̃����X�^�[��";
				mes "���E�e�n�ɂ͂т����Ă���c�c";
				next;
				emotion 21;
				mes "[�N���X]";
				mes "���܂Ȃ����A��������";
				mes "�����ɋ��͂��Ă���B";
				mes "����ł́A�M�N�̍K�^���F��B";
				close;
			}
		}
		mes "[�N���X]";
		mes "�����ɂ��Ă�";
		mes "���ɂ���⍲������";
		mes "�����Ă���B";
		close;
	}
OnInit:
	waitingroom "�������@��W",0;
	end;
}

prontera.gat,122,50,3	script	�������@�⍲��#Hunt_Prt	952,{
	if(BaseLevel < 70) {
		mes "[�������@�⍲��]";
		mes "���`��c�c";
		mes "���X�A���͎҂��W�܂�܂���ˁc�c";
		next;
		mes "[�������@�⍲��]";
		mes "����H�@�M������������";
		mes "�Q���������̂ł����H";
		next;
		mes "[�������@�⍲��]";
		mes "���C�����͂��肪�����ł���";
		mes "���܂̋M���ł͂܂�";
		mes "�͕s���̂悤�Ɍ����܂��B";
		mes "^FF0000���߂āABaseLv��70�ȏ�";
		mes "����΁c�c^000000";
		close;
	}
	switch(HUNT_QUE) {
	case 0:
		emotion 20;
		mes "[�������@�⍲��]";
		mes "���`��c�c";
		mes "���X�A���͎҂��W�܂�܂���ˁc�c";
		close;
	case 1:
		mes "[�������@�⍲��]";
		mes "���b�͉��ŕ������Ă��������܂����B";
		mes "����ł́A���������������ւ�";
		mes "�o�^�������Ă��������܂��B";
		next;
		mes "[�������@�⍲��]";
		mes "�ŏI�m�F�ł͂���܂����A";
		mes "���B�A�������ւ̋��͂�";
		mes "���Ă��������܂����H";
		mes "���͂��Ă���������̂ł���΁A";
		mes "�����ɓo�^�p�̃T�C����";
		mes "���肢�ł��܂����H";
		next;
		if(select("�������","����ς��߂܂�") == 2) {
			emotion 28;
			mes "[�������@�⍲��]";
			mes "�����ł����c�c";
			mes "����������������͂ł��܂��񂵂ˁB";
			mes "�܂��A�C���ς������";
			mes "���ɐ��������Ă��������B";
			close;
		}
		mes "[�������@�⍲��]";
		mes "�o�^���肪�Ƃ��������܂��B";
		mes "�������x��܂���";
		mes "���A�u�A�[�V�X�E�R�����v�Ƃ����܂��B";
		mes "���C�y�Ɂu�A�[�V�X�v�Ƃ��Ăщ������B";
		next;
		mes "[�A�[�V�X]";
		mes "�������o�����琺�������Ă��������B";
		mes "�˗���p�ӂ��Ă����܂��B";
		set HUNT_QUE,2;
		close;
	case 2:
		if(BaseLevel < 70) {
			mes "[�������@�⍲��]";
			mes "����H�@�M���͓�������";
			mes "���͂��Ă���Ă���";
			mes strcharinfo(0)+ "�l";
			mes "�ł͂���܂��񂩁B";
			mes "�������Ȃ������ɁA���X�͂�";
			mes "��܂��Ă��܂��Ă���悤�ł��ˁB";
			next;
			mes "[�������@�⍲��]";
			mes "�����֎Q������ɂ�";
			mes "^FF0000BaseLv70�ȏ�^000000�łȂ���";
			mes "�������Ǝv���܂��B";
			mes "�\���󂠂�܂��񂪁A";
			mes "BaseLv���グ�Ă���";
			mes "�܂����炵�Ă��������B";
			close;
		}
		break;
	}
	if('quelist1[0] == 0) {
		//���]��
		setarray 'moblist$[0][0][0],"�o�o���K","�E�W���X","���C�h���b�N","�X�m�E�A�[";
		setarray 'quelist[0][0][0],106850,106851,106852,106853;
		setarray 'moblist$[0][1][0],"�u���f�B�E���S�[����","�]���r�X���[�^�[","�[���̋R�m","�A�C�X�^�C�^��","�A�m���A��","�z�h��������","�_�[�N�s���M�L����","�A���[��","�G���V�F���g�~�~�b�N","�I�E���f���[�N","�}�u�J","�C�A��","�s���j�A","���f���[�T","�A�|�J���v�X","�^�^�`��";
		setarray 'quelist[0][1][0],106700,106701,106702,106703,106854,106855,106856,106857,106858,106859,106860,106861,106862,106863,106911,106912;
		setarray 'moblist$[0][2][0],"�o���V�[","�A�k�r�X","�G���I�b�g","�G���Z��","�X�R�O��","�v���X","���s�����","�Ď������","�ی삷���","�Ԃ߂��","�A�N�A�G�������^��","�i�[�K","�R���k�X","�C���v","�������~�m�^�E���X","�u���[�I�V�h�X","�S�[���h�I�V�h�X","�f�X���[�h","�I�E���o����","�J�u�L�E��","��V��","��Ȃ����o","�Z���`�s�[�h","�h�����f�X";
		setarray 'quelist[0][2][0],106704,106705,106706,106707,106708,106709,106710,106711,106712,106713,106714,106864,106865,106866,106867,106868,106869,106870,106871,106872,106873,106874,106913,106914;
		setarray 'moblist$[0][3][0],"�����N�̌��g(�V�g�^)","�����N�̌��g(�l�Ԍ^)","�����N�̌��g(�����^)","�l�N���}���T�[","�J�[�T","�A�K��","�G�L�I","�����R","�t�B��","�^�i�g�X�̑���","�^�i�g�X�̐�]","�^�i�g�X�̋�Y","�^�i�g�X�̔߂���";
		setarray 'quelist[0][3][0],106715,106716,106717,106720,106721,106722,106723,106724,106725,106726,106727,106728,106729;
		setarray 'moblist$[0][4][0],"�T���}���_�[","�Z�C����=�E�B���U�[","�_�[�N�v���[�X�g","�}�[�K���b�^=�\����","�G�����X=�K�C��","�n���[�h=�A���g�A�C�[��","�����N�̌��g(����^)","�X�P�S���g(��)","�X�P�S���g(��)","�Z�V��=�f�B����","�J�g���[�k=�P�C����";
		setarray 'quelist[0][4][0],106730,106732,106733,106734,106735,106736,106737,106738,106739,106915,106916;
		setarray 'moblist$[0][5][0],"�Z�C����=�E�B���U�[(Lv99)","�Z�V��=�f�B����(Lv99)","�J�g���[�k=�P�C����(Lv99)","�}�[�K���b�^=�\����(Lv99)","�G�����X=�K�C��(Lv99)","�n���[�h=�A���g�A�C�[��(Lv99)";
		setarray 'quelist[0][5][0],106740,106741,106742,106743,106744,106745;
		//�]��1���E�`���2���E
		setarray 'moblist$[1][0][0],"�o�o���K","�E�W���X","���C�h���b�N","�X�m�E�A�[";
		setarray 'quelist[1][0][0],106875,106876,106877,106878;
		setarray 'moblist$[1][1][0],"�u���f�B�E���S�[����","�]���r�X���[�^�[","�[���̋R�m","�A�C�X�^�C�^��","�A�m���A��","�z�h��������","�_�[�N�s���M�L����","�A���[��","�G���V�F���g�~�~�b�N","�I�E���f���[�N","�}�u�J","�C�A��","�s���j�A","���f���[�T","�A�|�J���v�X","�^�^�`��";
		setarray 'quelist[1][1][0],106746,106747,106748,106749,106879,106880,106881,106882,106883,106884,106885,106886,106887,106888,106917,106918;
		setarray 'moblist$[1][2][0],"�o���V�[","�A�k�r�X","�G���I�b�g","�G���Z��","�X�R�O��","�v���X","���s�����","�Ď������","�ی삷���","�Ԃ߂��","�A�N�A�G�������^��","�i�[�K","�R���k�X","�C���v","�������~�m�^�E���X","�u���[�I�V�h�X","�S�[���h�I�V�h�X","�f�X���[�h","�I�E���o����","�J�u�L�E��","��V��","��Ȃ����o","�Z���`�s�[�h","�h�����f�X";
		setarray 'quelist[1][2][0],106750,106751,106752,106753,106754,106755,106756,106757,106758,106759,106760,106889,106890,106891,106892,106893,106894,106895,106896,106897,106898,106899,106919,106920;
		setarray 'moblist$[1][3][0],"�����N�̌��g(�V�g�^)","�����N�̌��g(�l�Ԍ^)","�����N�̌��g(�����^)","�l�N���}���T�[","�J�[�T","�A�K��","�G�L�I","�����R","�t�B��","�^�i�g�X�̑���","�^�i�g�X�̐�]","�^�i�g�X�̋�Y","�^�i�g�X�̔߂���";
		setarray 'quelist[1][3][0],106761,106762,106763,106766,106767,106768,106769,106770,106771,106772,106773,106774,106775;
		setarray 'moblist$[1][4][0],"�T���}���_�[","�Z�C����=�E�B���U�[","�_�[�N�v���[�X�g","�}�[�K���b�^=�\����","�G�����X=�K�C��","�n���[�h=�A���g�A�C�[��","�����N�̌��g(����^)","�X�P�S���g(��)","�X�P�S���g(��)","�Z�V��=�f�B����","�J�g���[�k=�P�C����";
		setarray 'quelist[1][4][0],106776,106778,106779,106780,106781,106782,106783,106784,106785,106921,106922;
		setarray 'moblist$[1][5][0],"�Z�C����=�E�B���U�[(Lv99)","�Z�V��=�f�B����(Lv99)","�J�g���[�k=�P�C����(Lv99)","�}�[�K���b�^=�\����(Lv99)","�G�����X=�K�C��(Lv99)","�n���[�h=�A���g�A�C�[��(Lv99)";
		setarray 'quelist[1][5][0],106786,106787,106788,106789,106790,106791;
		//3���E
		setarray 'moblist$[2][0][0],"�u���f�B�E���S�[����","�]���r�X���[�^�[","�[���̋R�m","�A�C�X�^�C�^��","�A�|�J���v�X","�^�^�`��";
		setarray 'quelist[2][0][0],106792,106793,106794,106795,106923,106924;
		setarray 'moblist$[2][1][0],"�o���V�[","�A�k�r�X","�G���I�b�g","�G���Z��","�X�R�O��","�v���X","���s�����","�Ď������","�ی삷���","�Ԃ߂��","�A�N�A�G�������^��","�i�[�K","�R���k�X","�C���v","�������~�m�^�E���X","�u���[�I�V�h�X","�S�[���h�I�V�h�X","�f�X���[�h","�I�E���o����","�J�u�L�E��","��V��","��Ȃ����o","�Z���`�s�[�h","�h�����f�X";
		setarray 'quelist[2][1][0],106796,106797,106798,106799,106800,106801,106802,106803,106804,106805,106806,106900,106901,106902,106903,106904,106905,106906,106907,106908,106909,106910,106925,106926;
		setarray 'moblist$[2][2][0],"�����N�̌��g(�V�g�^)","�����N�̌��g(�l�Ԍ^)","�����N�̌��g(�����^)","�l�N���}���T�[","�J�[�T","�A�K��","�G�L�I","�����R","�t�B��","�^�i�g�X�̑���","�^�i�g�X�̐�]","�^�i�g�X�̋�Y","�^�i�g�X�̔߂���";
		setarray 'quelist[2][2][0],106807,106808,106809,106812,106813,106814,106815,106816,106817,106818,106819,106820,106821;
		setarray 'moblist$[2][3][0],"�T���}���_�[","�Z�C����=�E�B���U�[","�_�[�N�v���[�X�g","�}�[�K���b�^=�\����","�G�����X=�K�C��","�n���[�h=�A���g�A�C�[��","�����N�̌��g(����^)","�X�P�S���g(��)","�X�P�S���g(��)","�Z�V��=�f�B����","�J�g���[�k=�P�C����";
		setarray 'quelist[2][3][0],106822,106824,106825,106826,106827,106828,106829,106830,106831,106927,106928;
		setarray 'moblist$[2][4][0],"�Z�C����=�E�B���U�[(Lv99)","�Z�V��=�f�B����(Lv99)","�J�g���[�k=�P�C����(Lv99)","�}�[�K���b�^=�\����(Lv99)","�G�����X=�K�C��(Lv99)","�n���[�h=�A���g�A�C�[��(Lv99)";
		setarray 'quelist[2][4][0],106832,106833,106834,106835,106836,106837;
	}
	for(set '@num1,0; '@num1 < 3; set '@num1,'@num1+1) {
		for(set '@num2,0; '@num2 < 6; set '@num2,'@num2+1) {
			set '@max,getarraysize('quelist['@num1]['@num2]);
			for(set '@num3,0; '@num3 < '@max; set '@num3,'@num3+1) {
				if(checkquest('quelist['@num1]['@num2]['@num3])) {
					mes "[�A�[�V�X]";
					mes "���݁A" +strcharinfo(0)+ "�l��";
					mes "�˗����Ă��铢�������X�^�[�́A";
					mes 'moblist$['@num1]['@num2]['@num3];
					mes "�ł��ˁB";
					next;
					if(select("�������L�����Z������","��������") == 2) {
						mes "[�A�[�V�X]";
						mes "���������A�����X�^�[��";
						mes "���������肢�������܂��B";
						close;
					}
					mes "[�A�[�V�X]";
					mes "�L�����Z���c�c�ł������܂����H";
					mes "�˗����������Ă���ꍇ�ł�";
					mes "���Ȃ��������ɂȂ��Ă��܂��܂����A";
					mes "�{���ɃL�����Z�����Ă�";
					mes "��낵���ł����H";
					next;
					if(select("�͂�","������") == 2) {
						mes "[�A�[�V�X]";
						mes "�������܂�܂����B";
						mes "���������A�����X�^�[��";
						mes "���������肢�������܂��B";
						close;
					}
					mes "[�A�[�V�X]";
					mes "�������܂�܂����B";
					next;
					delquest 'quelist['@num1]['@num2]['@num3];
					mes "[�A�[�V�X]";
					mes "�˗����L�����Z��";
					mes "���Ă����܂����B";
					close;
				}
			}
		}
	}
	mes "[�A�[�V�X]";
	mes "��������Ⴂ�܂��A";
	mes strcharinfo(0)+ "�l�B";
	mes "�ǂ̈˗����󂯂Ă����܂����H";
	next;
	if(Upper != UPPER_HIGH && Class < CLASS_RK) {
		set '@huntclass,0;
		set '@huntnum,select("250�C�����N�G�X�g","200�C�����N�G�X�g","150�C�����N�G�X�g","100�C�����N�G�X�g","50�C�����N�G�X�g","1�C�����N�G�X�g") - 1;
	}
	else if(Class < CLASS_RK) {
		set '@huntclass,1;
		set '@huntnum,select("500�C�����N�G�X�g","400�C�����N�G�X�g","300�C�����N�G�X�g","200�C�����N�G�X�g","100�C�����N�G�X�g","3�C�����N�G�X�g") - 1;
	}
	else {
		set '@huntclass,2;
		set '@huntnum,select("600�C�����N�G�X�g","450�C�����N�G�X�g","300�C�����N�G�X�g","150�C�����N�G�X�g","5�C�����N�G�X�g") - 1;
	}
	set '@huntid,select(printarray('moblist$['@huntclass]['@huntnum][0])) - 1;
	mes "[�A�[�V�X]";
	mes 'moblist$['@huntclass]['@huntnum]['@huntid]+ "����";
	mes "��������󂯂Ă�����܂����H";
	next;
	if(select("�󂯂�","����ς��߂�") == 2) {
		mes "[�A�[�V�X]";
		mes "�����ł����c�c";
		mes "����ł́A�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	}
	setquest 'quelist['@huntclass]['@huntnum]['@huntid];
	mes "[�A�[�V�X]";
	mes "�����Ώۂɂ��܂��Ă�";
	mes "�o�^�������e�����m�F���������B";
	next;
	mes "^FF0000-����-";
	mes "�o�^���ꂽ���e�́A";
	mes "�N�G�X�g���X�g(Alt + U)��";
	mes "�m�F���邱�Ƃ��ł��܂��B^000000";
	next;
	mes "[�A�[�V�X]";
	mes "������B�����܂�����";
	mes "���̉��ɂ���[�������@����]��";
	mes "�񍐂����肢�������܂��B";
	next;
	mes "[�A�[�V�X]";
	mes strcharinfo(0)+ "�l��";
	mes "�����^�����F�肢�����܂��B";
	close;
}

izlude.gat,132,119,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Iz	951
izlude.gat,135,122,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Iz	952
payon.gat,167,109,5		duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Pay	951
payon.gat,167,113,5		duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Pay	952
geffen.gat,115,68,5		duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Gef	951
geffen.gat,115,72,5		duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Gef	952
alberta.gat,106,69,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Alb	951
alberta.gat,104,67,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Alb	952
morocc.gat,150,104,5	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Moc	951
morocc.gat,153,107,5	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Moc	952
alderaban.gat,146,113,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Alde	951
alderaban.gat,146,110,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Alde	952
yuno.gat,143,188,3		duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Yuno	951
yuno.gat,141,188,3		duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Yuno	952
lighthalzen.gat,167,102,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Lhz	951
lighthalzen.gat,170,105,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Lhz	952
hugel.gat,107,152,3		duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Hu	951
hugel.gat,110,152,3		duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Hu	952
rachel.gat,108,131,5	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Ra	951
rachel.gat,108,135,5	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Ra	952
veins.gat,203,132,3		duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Ve	951
veins.gat,201,132,3		duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Ve	952
amatsu.gat,107,162,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Ama	951
amatsu.gat,104,162,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Ama	952
moscovia.gat,218,198,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Mosk	951
moscovia.gat,217,196,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Mosk	952
brasilis.gat,191,264,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Bra	951
brasilis.gat,188,264,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Bra	952
mid_camp.gat,61,129,3	duplicate(�������@����#Hunt_Prt)	�������@����#Hunt_Mid	951
mid_camp.gat,58,132,3	duplicate(�������@�⍲��#Hunt_Prt)	�������@�⍲��#Hunt_Mid	952