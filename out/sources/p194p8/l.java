package p194p8;

import D9.o;
import J4.i;
import Q8.d;
import com.braze.Constants;
import com.obdeleven.service.util.Texttabe;
import com.obdeleven.service.util.b;
import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.R;
import p134k8.T1;

/* JADX INFO: compiled from: MeasurementValue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends T1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f45918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f45919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45921g;

    public l(byte[] bArr) {
        if (bArr.length > 0) {
            this.f45918d = bArr;
        } else {
            this.f45918d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:263:0x0b36  */
    public final void a() {
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iE = e();
        int iF = f();
        int iD = d();
        this.f42680c = o.l(iE, iD);
        String strK = o.k(iE);
        this.f45921g = strK;
        byte[] bArr = this.f45918d;
        String strConcat = "";
        switch (iE) {
            case 1:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.2f));
                break;
            case 2:
            case 3:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.002f));
                break;
            case 4:
                float f12 = iD;
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(f12 < 127.0f ? (127.0f - f12) * iF * 0.01f : (f12 - 127.0f) * iF * 0.01f));
                break;
            case 5:
            case 149:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 100.0f) * iF * 0.1f));
                break;
            case 6:
            case 12:
            case 21:
            case 22:
            case 24:
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case 138:
            case 167:
            case 181:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.001f));
                break;
            case 7:
            case 15:
            case 19:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
            case 137:
            case 144:
            case 145:
            case 174:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.01f));
                break;
            case 8:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case 173:
            case 176:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.1f));
                break;
            case 9:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 127.0f) * iF * 0.02f));
                break;
            case 10:
                this.f42679b = iD >= iF ? "warm" : "cold";
                break;
            case 11:
            case 146:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD - 128.0f) * iF * 1.0E-4f) + 1.0f));
                break;
            case 13:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 127.0f) * iF * 0.001f));
                break;
            case 14:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case 175:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.005f));
                break;
            case 16:
            case 136:
            case 161:
                int i16 = -1;
                if (iE != 161) {
                    iD &= iF;
                } else {
                    i16 = iF;
                }
                this.f42679b = "";
                if (i16 >= 0) {
                    for (int i17 = 7; i17 >= 0; i17--) {
                        this.f42679b = d.a(new StringBuilder(), this.f42679b, ((i16 >> i17) & 1) == 1 ? "1" : "0");
                    }
                    this.f42679b = d.a(new StringBuilder(), this.f42679b, " ");
                }
                for (int i18 = 7; i18 >= 0; i18--) {
                    this.f42679b = d.a(new StringBuilder(), this.f42679b, ((iD >> i18) & 1) == 1 ? "1" : (((iF >> i18) & 1) != 0 || i16 >= 0) ? "0" : " ");
                }
                break;
            case 17:
                this.f42679b = "" + ((char) iF) + ((char) iD);
                break;
            case 18:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.04f));
                break;
            case 20:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD - 128.0f) * iF) / 128.0f));
                break;
            case 23:
            case 129:
            case 133:
            case 180:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD * iF) / 256.0f));
                break;
            case 25:
            case 150:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * 256.0f) + iF) / 180.0f));
                break;
            case 26:
            case 28:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD - iF));
                break;
            case 27:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD < 128 ? (128.0f - iD) * iF * 0.01f : (iD - 128.0f) * iF * 0.01f));
                break;
            case 29:
                if (iD >= iF) {
                    this.f42679b = "272";
                } else {
                    this.f42679b = "271";
                }
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * iF) * 1.0f) / 12.0f));
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * iF) * 1.0f) / 2560.0f));
                break;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD));
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                if (iF != 0) {
                    this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD / iF) * 100.0f));
                } else {
                    this.f42679b = "???";
                }
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case 105:
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
            case 151:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.01f));
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case 179:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 256.0f) + iD) * 10.0f));
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case 156:
                float f13 = (iF * 256) + iD;
                if (iE == 37 || iE == 123) {
                    this.f42679b = Texttabe.c(String.format(Locale.US, "FSS%05d", Integer.valueOf((int) f13)));
                } else {
                    this.f42679b = String.format(Locale.US, strK, Float.valueOf(f13));
                }
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.001f));
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iF * iD) / 255.0f));
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((iF * 255.0f) + iD) - 4000.0f) * 0.1f));
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iF * 255.0f) + iD));
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 255.0f) + iD) * 0.1f));
                break;
            case 44:
                this.f42679b = String.format(Locale.US, "%02d:%02d", Integer.valueOf(iF), Integer.valueOf(iD));
                this.f42680c = "h";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((iF * 256.0f) + iD) - 32768.0f) * 0.00275f));
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF));
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 152:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * iD * 0.025f));
                break;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                if (iF != 0) {
                    this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD - 128.0f) * 100.0f) / iF));
                } else {
                    this.f42679b = "???";
                }
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case 153:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD - 128.0f) * iF) / 255.0f));
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 50.0f) * iF * 0.02f));
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((iD - 128.0f) * 256.0f) + iF) / 180.0f));
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iF * 256.0f) + iD + 65536.0f));
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD <= 127 ? iD : iD - 256.0f) * 1.023f));
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 256.0f) + iD) / 32768.0f));
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 256.0f) + iD) / 100.0f));
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (iF != 0) {
                    this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) / iF));
                } else {
                    this.f42679b = "???";
                }
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * iF) * 256.0f) / 1000.0f));
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                this.f42679b = new String(Arrays.copyOfRange(bArr, 1, Math.min(40, bArr.length - 1) + 1));
                break;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD + iF));
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 127.0f) * iF * 0.01f));
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD * iF) / 512.0f));
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case 166:
                if (iE != 166) {
                    switch (iE) {
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            this.f42680c = "º";
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            this.f42680c = "º/s";
                            f10 = 0.1358f;
                            i10 = (iD & 255) | ((iF & 3) << 8);
                            if ((iF & 128) != 0) {
                                i10 = (((~i10) & 1023) + 1) * (-1);
                            }
                            this.f42679b = String.format(Locale.US, strK, Float.valueOf(i10 * f10));
                            break;
                        case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                            this.f42680c = "bar";
                            f10 = 0.3255f;
                            i10 = (iD & 255) | ((iF & 3) << 8);
                            if ((iF & 128) != 0) {
                                i10 = (((~i10) & 1023) + 1) * (-1);
                            }
                            this.f42679b = String.format(Locale.US, strK, Float.valueOf(i10 * f10));
                            break;
                        case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                            this.f42680c = "m/s2";
                            f10 = 0.192f;
                            i10 = (iD & 255) | ((iF & 3) << 8);
                            if ((iF & 128) != 0) {
                                i10 = (((~i10) & 1023) + 1) * (-1);
                            }
                            this.f42679b = String.format(Locale.US, strK, Float.valueOf(i10 * f10));
                            break;
                        default:
                            this.f42679b = "";
                            break;
                    }
                } else {
                    this.f42680c = "º/s";
                }
                f10 = 2.5f;
                i10 = (iD & 255) | ((iF & 3) << 8);
                if ((iF & 128) != 0) {
                    i10 = (((~i10) & 1023) + 1) * (-1);
                }
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(i10 * f10));
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case 128:
            case 134:
            case 135:
            case 154:
            case 172:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF));
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                float f14 = iF;
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((211.0f - f14) * iD) + (255.0f * f14)) / 4080.0f));
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * iD * 0.01f));
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * 0.1f * iD));
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * 60.0f) + (iF * 255.0f)) / 4080.0f));
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD <= 127 ? iD : iD - 256.0f) * 1.819f));
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD));
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 85:
            case 157:
                if (iE == 85) {
                    this.f42680c = "º/s";
                    f11 = 0.002865f;
                } else if (iE != 157) {
                    switch (iE) {
                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                            this.f42680c = "º";
                            f11 = 0.04375f;
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            this.f42680c = "m/s2";
                            f11 = 0.00981f;
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                            this.f42680c = "bar";
                            f11 = 0.01f;
                            break;
                        default:
                            this.f42679b = "";
                            break;
                    }
                } else {
                    this.f42680c = "cm";
                    f11 = 1.0f;
                }
                int i19 = ((iF & 127) << 8) | (iD & 255);
                if ((iF & 128) != 0) {
                    i19 = (((~i19) & 32767) + 1) * (-1);
                }
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(i19 * f11));
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                int i20 = iD & 127;
                if ((128 & iD) != 0) {
                    i20 = (((~i20) & 127) + 1) * (-1);
                }
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(i20 * 0.0973f));
                this.f42680c = "m/s2";
                break;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.1f));
                break;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case 100:
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * iD * 0.1f));
                break;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * iD));
                break;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                this.f42679b = new String(Arrays.copyOfRange(bArr, 2, Math.min(40, iF) + 2));
                this.f42680c = "";
                break;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - iF) * 5.0f));
                break;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iF * 256.0f) + iD));
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD * 0.05f) + iF));
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.2f));
                break;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.1f));
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                this.f42679b = String.format("0x%04X", Integer.valueOf((iF * 256) + iD));
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                StringBuilder sb2 = new StringBuilder();
                if (bArr.length >= 15) {
                    for (int i21 = 7; i21 >= 0; i21--) {
                        sb2.append((iD >> i21) & 1);
                    }
                    sb2.append(' ');
                    int iC = c(3);
                    if (iC >= 15) {
                        sb2.append('-');
                    } else {
                        sb2.append(iC);
                    }
                    sb2.append(' ');
                    int iC2 = c(4);
                    if (iC2 == 255) {
                        sb2.append('-');
                    } else {
                        sb2.append(iC2);
                    }
                    sb2.append(' ');
                    int iC3 = c(5);
                    if (iC3 == 255) {
                        sb2.append('-');
                    } else {
                        sb2.append(iC3);
                    }
                    sb2.append(' ');
                    int iC4 = c(8) + ((c(7) + (c(6) * 256)) * 256);
                    if (iC4 >= 1048575) {
                        sb2.append('-');
                    } else {
                        String strB = i.b(iC4, "");
                        for (int length = 7 - strB.length(); length > 0; length--) {
                            sb2.append('0');
                        }
                        sb2.append(strB);
                    }
                    sb2.append(' ');
                    sb2.append(c(9));
                    sb2.append(' ');
                    int i22 = iC3 & 1;
                    if (c(10) > 1 && bArr[11] == -1 && bArr[12] == -1 && bArr[13] == -1 && bArr[14] == -1) {
                        sb2.append('-');
                    } else if (i22 > 0) {
                        int iC5 = c(14) + ((c(13) + ((c(12) + (c(11) * 256)) * 256)) * 256);
                        if (iC5 == -1) {
                            sb2.append("4294967295");
                        } else {
                            sb2.append(iC5);
                        }
                    } else {
                        int iC6 = (c(12) >> 1) & 31;
                        if (iC6 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(iC6);
                        sb2.append('.');
                        int iC7 = 15 & ((c(12) + (c(11) * 256)) >> 6);
                        if (iC7 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(iC7);
                        sb2.append('.');
                        int iC8 = ((c(11) + (c(10) * 256)) >> 2) & 127;
                        if (iC8 < 10) {
                            sb2.append('0');
                            sb2.append(iC8);
                            sb2.append(' ');
                            int iC9 = ((c(13) + (c(12) * 256)) >> 4) & 31;
                            if (iC9 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(iC9);
                            sb2.append(':');
                            int iC10 = ((c(14) + (c(13) * 256)) >> 6) & 63;
                            if (iC10 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(iC10);
                            sb2.append(':');
                            int iC11 = c(14) & 63;
                            if (iC11 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(iC11);
                        }
                    }
                    this.f42679b = sb2.toString();
                } else {
                    b(iE, iF, iD);
                }
                break;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                this.f42679b = "";
                break;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                if (bArr.length >= 7) {
                    this.f42679b = ((c(3) + ((iF << 16) + (iD << 8))) >> 3) + " ";
                    this.f42679b += ((c(4) + ((c(3) & 7) << 8)) >> 1) + " ";
                    this.f42679b += (c(6) + ((c(4) & 1) << 16) + (c(5) << 8));
                } else {
                    b(iE, iF, iD);
                }
                break;
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                if (bArr.length >= 4) {
                    this.f42679b = i.b(c(3) + (iF << 16) + (iD << 8), "");
                } else {
                    b(iE, iF, iD);
                }
                break;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 64.0f) * iF * 0.01f));
                break;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                this.f42679b = b.a(Arrays.copyOfRange(bArr, 2, iF + 2));
                break;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 1.41f));
                break;
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * 256.0f) + iF) * 0.5f));
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((iD * 256.0f) + iF) - 32768.0f) * 0.01f));
                break;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF - iD));
                break;
            case 127:
                Locale locale = Locale.US;
                this.f42679b = String.format(locale, "%02d.", Integer.valueOf((iF >> 3) & 31));
                this.f42679b += String.format(locale, "%02d.", Integer.valueOf((((iF * 256) + (iD & 255)) >> 7) & 15));
                this.f42679b += String.format(locale, "%04d", Integer.valueOf((127 & iD) + 2000));
                break;
            case 130:
            case 170:
            case 171:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD * iF) / 2560.0f));
                break;
            case 131:
                int i23 = (((iF * iD) * 5) / 10) - 30;
                if (i23 < 0) {
                    this.f42679b = "" + (-i23);
                    this.f42680c = "°v.OT";
                } else {
                    this.f42679b = i.b(i23, "");
                    this.f42680c = "°n.OT";
                }
                break;
            case 132:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD * iF * 0.5f));
                break;
            case 139:
            case 140:
            case 147:
                if (this.f45920f) {
                    byte[] bArr2 = this.f45919e;
                    if (bArr2.length >= 17) {
                        if (iE != 139) {
                            if (iE != 140) {
                                this.f42680c = "%";
                            } else {
                                this.f42680c = "ºC";
                            }
                            i15 = iF;
                            i13 = 1;
                            i11 = 1;
                            i12 = 10;
                            i14 = 5;
                        } else {
                            this.f42680c = "1/min";
                            i11 = iF;
                            i12 = 1;
                            i13 = 10;
                            i14 = 0;
                            i15 = 0;
                        }
                        int i24 = iD >> 4;
                        int i25 = bArr2[i24] & 255;
                        int i26 = i24 << 4;
                        int i27 = i24 + 1;
                        int i28 = i27 << 4;
                        if (i26 != iD) {
                            int i29 = i28 - i26;
                            i25 = ((((((((bArr2[i27] & 255) - i25) * (iD - i26)) + (i25 * i29)) * i12) * i11) / i29) + i14) / 10;
                        } else if (iE == 139) {
                            i25 = (i25 * iF) / 10;
                        }
                        this.f42679b = i.b((i25 - i15) * i13, "");
                    } else {
                        b(iE, iF, iD);
                    }
                } else {
                    b(iE, iF, iD);
                }
                break;
            case 141:
                if (!this.f45920f) {
                    b(iE, iF, iD);
                } else {
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        byte[] bArr3 = this.f45919e;
                        if (i32 < bArr3.length) {
                            strConcat = strConcat.concat(Character.toString((char) (bArr3[i32] & 255)));
                            if ((this.f45919e[i32] & 255) == 3) {
                                if (i30 == iD) {
                                    this.f42679b = strConcat.substring(i31, i32);
                                } else {
                                    i31 = i32 + 1;
                                    i30++;
                                }
                                break;
                            }
                            i32++;
                        }
                    }
                }
                break;
            case 142:
                this.f42679b = "" + ((char) iD);
                break;
            case 143:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iD > 127 ? (iD - 128.0f) * iF * 0.01f : (128.0f - iD) * iF * 0.01f));
                break;
            case 148:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD - 128.0f) * iF * 0.25f));
                break;
            case 155:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * iD) * 0.01f) - 90.0f));
                break;
            case 158:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 256.0f) + iD) * 0.01f));
                break;
            case 159:
                float f15 = iD;
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((f15 - 127.0f) * 256.0f) + f15) * 0.1f));
                break;
            case 160:
                int iC12 = (c(3) + (iD * 256)) * iF;
                int iC13 = c(4);
                int i33 = iC12 * (iC13 & 15);
                if ((iC13 & 128) != 0) {
                    i33 *= -1;
                }
                float f16 = i33;
                for (int i34 = (byte) ((iC13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) >> 4); i34 > 0; i34--) {
                    f16 *= 0.1f;
                }
                this.f42679b = String.format(Locale.US, this.f45921g, Float.valueOf(f16));
                int iC14 = c(5);
                int i35 = iC14 >> 6;
                if (i35 == 1) {
                    this.f42680c = "k";
                } else if (i35 == 2) {
                    this.f42680c = "m";
                } else if (i35 != 3) {
                    this.f42680c = "";
                } else {
                    this.f42680c = "µ";
                }
                switch (iC14 & 63) {
                    case 1:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "V");
                        break;
                    case 2:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Vss");
                        break;
                    case 3:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "A");
                        break;
                    case 4:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Ah");
                        break;
                    case 5:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Ohm");
                        break;
                    case 6:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "W");
                        break;
                    case 7:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "W/m2");
                        break;
                    case 8:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "W/cm2");
                        break;
                    case 9:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Wh");
                        break;
                    case 10:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Ws");
                        break;
                    case 11:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "m");
                        break;
                    case 12:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "m/s");
                        break;
                    case 13:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "m/s2");
                        break;
                    case 14:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "cm");
                        break;
                    case 15:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "km/h");
                        break;
                    case 16:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "l");
                        break;
                    case 17:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "l/100");
                        break;
                    case 18:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "l/mm");
                        break;
                    case 19:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "l/h");
                        break;
                    case 20:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "l/km");
                        break;
                    case 21:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                        break;
                    case 22:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "h");
                        break;
                    case 23:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Mon");
                        break;
                    case 24:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "g");
                        break;
                    case 25:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "g/s");
                        break;
                    case 26:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "mg/h");
                        break;
                    case 27:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Nm");
                        break;
                    case 28:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "N");
                        break;
                    case 29:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "bar");
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "º");
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "<º");
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "ºC");
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "ºF");
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "º/s");
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        if (i33 < 0) {
                            this.f42680c = d.a(new StringBuilder(), this.f42680c, "º v. OT");
                        } else {
                            this.f42680c = d.a(new StringBuilder(), this.f42680c, "º n. OT");
                        }
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "U/min");
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "%");
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "KW");
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "KW");
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "1/s");
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "Imp");
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        this.f42680c = d.a(new StringBuilder(), this.f42680c, "dB");
                        break;
                }
                break;
            case 162:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(iF * iD * 0.448f));
                break;
            case 163:
                this.f42679b = String.format(Locale.US, "%02d:%02d", Integer.valueOf(iF), Integer.valueOf(iD));
                this.f42680c = " Uhr";
                break;
            case 164:
                if (iD > 100 && iD <= 200) {
                    iD -= 100;
                }
                this.f42679b = Integer.toString(iD);
                if (iD == 255) {
                    this.f42679b = "XXX";
                }
                this.f42680c = "%";
                break;
            case 165:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iD * 256.0f) + iF) - 32768.0f));
                break;
            case 168:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF * 256.0f) + iD) * 0.01f));
                break;
            case 169:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((iD * iF) + 200.0f));
                break;
            case 177:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf(((iF - 128.0f) * 256.0f) + iD));
                break;
            case 178:
                this.f42679b = String.format(Locale.US, strK, Float.valueOf((((iF - 128.0f) * 256.0f) + iD) * 0.117647f));
                break;
            default:
                b(iE, iF, iD);
                break;
        }
    }

    public final void b(int i10, int i11, int i12) {
        if (i10 > 255 || i11 > 255 || i12 > 255 || i10 < 0 || i11 < 0 || i12 < 0) {
            this.f42679b = "??? ???";
            this.f42680c = "???";
        } else {
            Locale locale = Locale.US;
            this.f42679b = String.format(locale, "%03d %03d", Integer.valueOf(i12), Integer.valueOf(i11));
            this.f42680c = String.format(locale, "%03d", Integer.valueOf(i10));
        }
    }

    public final int c(int i10) {
        return this.f45918d[i10] & 255;
    }

    public final int d() {
        return this.f45918d[2] & 255;
    }

    public final int e() {
        return this.f45918d[0] & 255;
    }

    public final int f() {
        return this.f45918d[1] & 255;
    }
}
