#-*-coding:utf-8-*-

import mkparser
import Templates
import sys
sys.path.append('./')
import os

path = os.path.abspath('./')
mkparser.mkLabelAndRateMsg(path)
mkparser.mkSysMessageYml(path)
