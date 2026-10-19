package com.voltasit.obdeleven.core.app;

import com.braze.Constants;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;
import p134k8.T1;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2084a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30076c;

    public /* synthetic */ C2084a(Object obj, int i10, Object obj2) {
        this.f30074a = i10;
        this.f30075b = obj;
        this.f30076c = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws MeasurementException {
        ArrayList arrayList;
        switch (this.f30074a) {
            case 0:
                C2089d c2089d = (C2089d) this.f30075b;
                c2089d.getClass();
                return ((p146l8.a) this.f30076c).a().continueWith(new V8.z(c2089d, 1, task));
            default:
                p194p8.m mVar = (p194p8.m) this.f30075b;
                mVar.getClass();
                String str = (String) task.getResult();
                if (str == null) {
                    throw new MeasurementException(2);
                }
                ArrayList arrayList2 = mVar.f45924c;
                arrayList2.clear();
                ArrayList arrayList3 = new ArrayList();
                int length = str.length() / 2;
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    iArr[i10] = Integer.parseInt(str.substring(i11, i11 + 2), 16);
                }
                switch (mVar.f45923b) {
                    case 1:
                        int i12 = iArr[0];
                        int i13 = i12 & 127;
                        boolean z10 = ((i12 >> 7) & 1) == 1;
                        int i14 = iArr[1];
                        boolean z11 = ((i14 >> 3) & 1) == 1;
                        boolean z12 = (i14 & 1) == 1;
                        boolean z13 = ((i14 >> 4) & 1) == 1;
                        boolean z14 = ((i14 >> 1) & 1) == 1;
                        boolean z15 = ((i14 >> 5) & 1) == 1;
                        boolean z16 = ((i14 >> 2) & 1) == 1;
                        boolean z17 = ((i14 >> 6) & 1) == 1;
                        int i15 = iArr[2];
                        boolean z18 = (i15 & 1) == 1;
                        int i16 = iArr[3];
                        boolean z19 = (i16 & 1) == 1;
                        boolean z20 = ((i15 >> 1) & 1) == 1;
                        boolean z21 = ((i16 >> 1) & 1) == 1;
                        boolean z22 = ((i15 >> 2) & 1) == 1;
                        boolean z23 = ((i16 >> 2) & 1) == 1;
                        boolean z24 = ((i15 >> 3) & 1) == 1;
                        boolean z25 = ((i16 >> 3) & 1) == 1;
                        boolean z26 = ((i15 >> 5) & 1) == 1;
                        boolean z27 = ((i16 >> 5) & 1) == 1;
                        boolean z28 = ((i15 >> 6) & 1) == 1;
                        boolean z29 = ((i16 >> 6) & 1) == 1;
                        boolean z30 = ((i15 >> 7) & 1) == 1;
                        boolean z31 = ((i16 >> 7) & 1) == 1;
                        String strC = Texttabe.c("MAS00063");
                        if (strC == null || strC.isEmpty()) {
                            strC = "Off";
                        }
                        String strC2 = Texttabe.c("MAS00062");
                        if (strC2 == null || strC2.isEmpty()) {
                            strC2 = "On";
                        }
                        String strC3 = Texttabe.c("MAS00319");
                        if (strC3 == null || strC3.isEmpty()) {
                            strC3 = "Not activated";
                        }
                        String strC4 = Texttabe.c("MAS00504");
                        if (strC4 == null || strC4.isEmpty()) {
                            strC4 = "not completed successfully";
                        }
                        String strC5 = Texttabe.c("MAS00505");
                        if (strC5 == null || strC5.isEmpty()) {
                            strC5 = "completed successfully";
                        }
                        String strC6 = Texttabe.c("MAS00503");
                        if (strC6 == null || strC6.isEmpty()) {
                            strC6 = "Number of emission-relevant DTC memory entries";
                        }
                        String str2 = strC;
                        String str3 = strC6;
                        boolean z32 = z31;
                        arrayList3.add(new T1(str3, Integer.toString(i13), ""));
                        String strC7 = Texttabe.c("MAS00317");
                        if (strC7 == null || strC7.isEmpty()) {
                            strC7 = "Malfunction indicator lamp";
                        }
                        arrayList3.add(new T1(strC7, z10 ? strC2 : str2, ""));
                        String strC8 = Texttabe.c("MAS00328");
                        if (strC8 == null || strC8.isEmpty()) {
                            strC8 = "Monitoring of ignition misfires";
                        }
                        arrayList3.add(new T1(strC8, z12 ? z13 ? strC4 : strC5 : strC3, ""));
                        String strC9 = Texttabe.c("MAS00329");
                        if (strC9 == null || strC9.isEmpty()) {
                            strC9 = "Monitoring of fuel system";
                        }
                        arrayList3.add(new T1(strC9, z14 ? z15 ? strC4 : strC5 : strC3, ""));
                        String strC10 = Texttabe.c("MAS00330");
                        if (strC10 == null || strC10.isEmpty()) {
                            strC10 = "Monitoring of entire system";
                        }
                        arrayList3.add(new T1(strC10, z16 ? z17 ? strC4 : strC5 : strC3, ""));
                        String str4 = "Monitoring of EGR and camshaft adjustment";
                        String str5 = "Monitoring of oxygen sensor";
                        if (z11) {
                            String strC11 = Texttabe.c("MAS04099");
                            if (strC11 == null || strC11.isEmpty()) {
                                strC11 = "Monitoring of oxidation catalytic converter";
                            }
                            arrayList3.add(new T1(strC11, z18 ? z19 ? strC4 : strC5 : strC3, ""));
                            String strC12 = Texttabe.c("MAS04100");
                            if (strC12 == null || strC12.isEmpty()) {
                                strC12 = "Monitoring of NOx catalytic converter";
                            }
                            arrayList3.add(new T1(strC12, z20 ? z21 ? strC4 : strC5 : strC3, ""));
                            String strC13 = Texttabe.c("MAS04101");
                            if (strC13 == null || strC13.isEmpty()) {
                                strC13 = "Monitoring of charge pressure control";
                            }
                            arrayList3.add(new T1(strC13, z24 ? z25 ? strC4 : strC5 : strC3, ""));
                            String strC14 = Texttabe.c("MAS00339");
                            if (strC14 != null && !strC14.isEmpty()) {
                                str5 = strC14;
                            }
                            arrayList3.add(new T1(str5, z26 ? z27 ? strC4 : strC5 : strC3, ""));
                            String strC15 = Texttabe.c("MAS04103");
                            if (strC15 == null || strC15.isEmpty()) {
                                strC15 = "Monitoring of particle filter";
                            }
                            arrayList3.add(new T1(strC15, z28 ? z29 ? strC4 : strC5 : strC3, ""));
                            String strC16 = Texttabe.c("MAS04104");
                            if (strC16 != null && !strC16.isEmpty()) {
                                str4 = strC16;
                            }
                            arrayList3.add(new T1(str4, z30 ? z32 ? strC4 : strC5 : strC3, ""));
                        } else {
                            String strC17 = Texttabe.c("MAS00334");
                            if (strC17 == null || strC17.isEmpty()) {
                                strC17 = "Catalytic converter monitoring";
                            }
                            arrayList3.add(new T1(strC17, z18 ? z19 ? strC4 : strC5 : strC3, ""));
                            String strC18 = Texttabe.c("MAS00335");
                            if (strC18 == null || strC18.isEmpty()) {
                                strC18 = "Monitoring of catalytic converter at operating temperature";
                            }
                            arrayList3.add(new T1(strC18, z20 ? z21 ? strC4 : strC5 : strC3, ""));
                            String strC19 = Texttabe.c("MAS00336");
                            if (strC19 == null || strC19.isEmpty()) {
                                strC19 = "Monitoring of tank ventilation system";
                            }
                            arrayList3.add(new T1(strC19, z22 ? z23 ? strC4 : strC5 : strC3, ""));
                            String strC20 = Texttabe.c("MAS00337");
                            if (strC20 == null || strC20.isEmpty()) {
                                strC20 = "Monitoring of Secondary Air Injection (AIR) system";
                            }
                            arrayList3.add(new T1(strC20, z24 ? z25 ? strC4 : strC5 : strC3, ""));
                            String strC21 = Texttabe.c("MAS00339");
                            if (strC21 != null && !strC21.isEmpty()) {
                                str5 = strC21;
                            }
                            arrayList3.add(new T1(str5, z26 ? z27 ? strC4 : strC5 : strC3, ""));
                            String strC22 = Texttabe.c("MAS00340");
                            if (strC22 == null || strC22.isEmpty()) {
                                strC22 = "Monitoring of oxygen sensor heater";
                            }
                            arrayList3.add(new T1(strC22, z28 ? z29 ? strC4 : strC5 : strC3, ""));
                            String strC23 = Texttabe.c("MAS04104");
                            if (strC23 != null && !strC23.isEmpty()) {
                                str4 = strC23;
                            }
                            arrayList3.add(new T1(str4, z30 ? z32 ? strC4 : strC5 : strC3, ""));
                        }
                        arrayList = arrayList2;
                        break;
                    case 2:
                    case 3:
                    case 18:
                    case 19:
                    case 28:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    default:
                        arrayList = arrayList2;
                        break;
                    case 4:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case 5:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                        arrayList = arrayList2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                        arrayList = arrayList2;
                        break;
                    case 10:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] * 3), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case 11:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case 12:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / 4), "rpm"));
                        arrayList = arrayList2;
                        break;
                    case 13:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), "km/h"));
                        arrayList = arrayList2;
                        break;
                    case 14:
                        arrayList3.add(new T1(null, Float.toString((iArr[0] - 128) / 2.0f), "° relative to #1 cylinder"));
                        arrayList = arrayList2;
                        break;
                    case 15:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                        arrayList = arrayList2;
                        break;
                    case 16:
                        arrayList3.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) / 100.0f), "g/s"));
                        arrayList = arrayList2;
                        break;
                    case 17:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        arrayList3.add(new T1(null, Float.toString(iArr[0] / 200.0f), "V"));
                        arrayList3.add(new T1(null, Integer.toString(((iArr[1] - 128) * 100) / 128), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        arrayList3.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        arrayList3.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "km"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        arrayList3.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) * 0.079f), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) * 10), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        arrayList3.add(new T1(null, Z3.o.c((iArr[0] << 8) | iArr[1], 2, 65535), ""));
                        arrayList3.add(new T1(null, Z3.o.c((iArr[2] << 8) | iArr[3], 8, 65535), "V"));
                        arrayList = arrayList2;
                        break;
                    case 44:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), ""));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        arrayList3.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "km"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                        int i17 = (iArr[0] << 8) | iArr[1];
                        if (Integer.highestOneBit(i17) == 32768) {
                            i17 |= (-65536) + i17;
                        }
                        arrayList3.add(new T1(null, Integer.toString(i17 / 4), "Pa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / 32768), ""));
                        arrayList3.add(new T1(null, Integer.toString((((iArr[2] << 8) | iArr[3]) / 256) - 128), "mA"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        arrayList3.add(new T1(null, Float.toString((((iArr[0] << 8) | iArr[1]) / 10.0f) - 40.0f), "°C"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        arrayList3.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) / 1000.0f), "V"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        arrayList3.add(new T1(null, Z3.o.c((iArr[0] << 8) | iArr[1], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / 32768), ""));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        arrayList3.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "min"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), ""));
                        arrayList3.add(new T1(null, Integer.toString(iArr[1]), "V"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[2]), "mA"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[3] * 10), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] * 10), "g/s"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0]), ""));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) - 32767), "Pa"));
                        arrayList = arrayList2;
                        break;
                    case 85:
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                        arrayList3.add(new T1(null, Integer.toString(((iArr[1] - 128) * 100) / 128), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        arrayList3.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) * 10), "kPa"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        arrayList3.add(new T1(null, Z3.o.c(iArr[0], 100, 255), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                        arrayList3.add(new T1(null, Float.toString((((iArr[0] << 8) | iArr[1]) - 26880.0f) / 128.0f), "°"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        arrayList3.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) * 0.05f), "l/h"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 125), "%"));
                        arrayList = arrayList2;
                        break;
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        arrayList3.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "Nm"));
                        arrayList = arrayList2;
                        break;
                    case 100:
                        arrayList3.add(new T1(null, Integer.toString(iArr[0] - 125), "%"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[1] - 125), "%"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[2] - 125), "%"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[3] - 125), "%"));
                        arrayList3.add(new T1(null, Integer.toString(iArr[4] - 125), "%"));
                        arrayList = arrayList2;
                        break;
                }
                arrayList.addAll(arrayList3);
                return mVar.a((ValueUnit) this.f30076c);
        }
    }
}
