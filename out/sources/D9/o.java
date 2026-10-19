package D9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1141q;
import androidx.navigation.compose.C1411d;
import androidx.navigation.compose.C1412e;
import androidx.navigation.compose.C1423p;
import com.braze.Constants;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONArray;
import p114j1.A;
import p141l2.H;
import p141l2.Q;

/* JADX INFO: compiled from: GlobalInterceptors.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements F3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f2901a;

    public static final C1138n c(C1141q c1141q) {
        Canvas canvas = C1139o.f13774a;
        C1138n c1138n = new C1138n();
        c1138n.f13771a = new Canvas(androidx.compose.ui.graphics.r.a(c1141q));
        return c1138n;
    }

    public static float d(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float e(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final boolean f(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.i.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final H h(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        H h8 = new H(context);
        p163n2.j jVar = h8.f44310b;
        Q q10 = jVar.f44802s;
        q10.a(new C1411d(q10));
        jVar.f44802s.a(new C1412e());
        jVar.f44802s.a(new C1423p());
        return h8;
    }

    public static int i(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fD = d(((i10 >> 16) & 255) / 255.0f);
        float fD2 = d(((i10 >> 8) & 255) / 255.0f);
        float fD3 = d((i10 & 255) / 255.0f);
        float fD4 = d(((i11 >> 16) & 255) / 255.0f);
        float fD5 = d(((i11 >> 8) & 255) / 255.0f);
        float fD6 = d((i11 & 255) / 255.0f);
        float fB = Z3.n.b(f12, f11, f10, f11);
        float fB2 = Z3.n.b(fD4, fD, f10, fD);
        float fB3 = Z3.n.b(fD5, fD2, f10, fD2);
        float fB4 = Z3.n.b(fD6, fD3, f10, fD3);
        float fE = e(fB2) * 255.0f;
        float fE2 = e(fB3) * 255.0f;
        return Math.round(e(fB4) * 255.0f) | (Math.round(fE) << 16) | (Math.round(fB * 255.0f) << 24) | (Math.round(fE2) << 8);
    }

    public static final float j(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static String k(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 14:
            case 16:
            case 18:
            case 19:
            case 23:
            case 26:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case 128:
            case 129:
            case 134:
            case 135:
            case 136:
            case 139:
            case 140:
            case 147:
            case 152:
            case 154:
            case 156:
            case 165:
            case 169:
            case 172:
            case 173:
            case 176:
            case 177:
            case 179:
            case 180:
                return "%.0f";
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 13:
            case 15:
            case 20:
            case 25:
            case 27:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case 100:
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
            case 130:
            case 133:
            case 137:
            case 138:
            case 143:
            case 149:
            case 150:
            case 167:
            case 171:
            case 174:
            case 175:
            case 178:
                return "%.1f";
            case 10:
            case 17:
            case 44:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
            case 127:
            case 141:
            case 142:
            case 161:
            case 163:
            case 164:
            default:
                return "%s";
            case 11:
            case 22:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 85:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case 105:
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
            case 131:
            case 132:
            case 144:
            case 145:
            case 146:
            case 148:
            case 151:
            case 153:
            case 160:
            case 168:
            case 170:
                return "%.2f";
            case 21:
            case 24:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
            case 181:
                return "%.3f";
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return "%.4f";
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case 155:
            case 157:
            case 158:
            case 159:
            case 162:
            case 166:
                return "%.5f";
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return "%.6f";
        }
    }

    public static String l(int i10, int i11) {
        switch (i10) {
            case 1:
                return "/min";
            case 2:
                return "%";
            case 3:
                return "<°";
            case 4:
                return i11 >= 127 ? "°n.OT" : "°v.OT";
            case 5:
                return "°C";
            case 6:
                return "V";
            case 7:
                return "km/h";
            case 8:
            case 10:
            case 11:
            case 16:
            case 17:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case 44:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
            case 127:
            case 135:
            case 136:
            case 141:
            case 142:
            case 146:
            case 160:
            case 161:
            case 163:
            case 179:
            default:
                return "";
            case 9:
                return "<°";
            case 12:
                return "Ohm";
            case 13:
                return "mm";
            case 14:
                return "bar";
            case 15:
                return "ms";
            case 18:
                return "mbar";
            case 19:
                return "l";
            case 20:
                return "%";
            case 21:
                return "V";
            case 22:
                return "ms";
            case 23:
                return "%";
            case 24:
                return "A";
            case 25:
                return "g/s";
            case 26:
                return "°C";
            case 27:
                return i11 > 128 ? "°v.OT" : "°n.OT";
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return "°KW";
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return "%";
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return "°KW";
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return "l/h";
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return "km";
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return "°KW";
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return "mg/H";
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return "A";
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return "Ah";
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return "kW";
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return "V";
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return "l/100";
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return "°KW";
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return "ms";
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return "mg/H";
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return "mbar";
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return "mg/H";
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return "Nm";
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return "g/s";
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return "/s";
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "Ohm";
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return "mm";
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return "V";
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return "cm";
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return "V";
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return "Ohm";
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return "Mon";
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return "kOhm";
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return "V";
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return "1/s";
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return "kOhm";
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return "°";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return "m/s2";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return "bar";
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return "m/s2";
            case 85:
                return "°/s";
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return "A";
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return "°/s";
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return "kOhm";
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return "h";
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return "Kg";
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return "°";
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return "km";
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return "Nm";
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return "mbar";
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return "°C";
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return "Imp.";
            case 100:
                return "bar";
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return "l/mm";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return "mm";
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return "V";
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "ml";
            case 105:
                return "m";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "km/h";
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return "Km";
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                return "°";
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return "m";
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return "W";
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return "/min";
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return "°C";
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return "%";
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return "°";
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return "mA";
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return "dB";
            case 128:
                return "/min";
            case 129:
                return "%";
            case 130:
                return "A";
            case 131:
                return i11 < 128 ? "°v.OT" : "°n.OT";
            case 132:
                return "<°";
            case 133:
                return "V";
            case 134:
                return "km/h";
            case 137:
                return "ms";
            case 138:
                return "Vss";
            case 139:
                return "/min";
            case 140:
                return "°";
            case 143:
                return (i11 != 0 && i11 < 128) ? "°n.OT" : "°v.OT";
            case 144:
                return "l/h";
            case 145:
                return "l/100";
            case 147:
                return "%";
            case 148:
                return "/min";
            case 149:
                return "°C";
            case 150:
                return "g/s";
            case 151:
                return "°KW";
            case 152:
            case 153:
                return "mg/H";
            case 154:
            case 155:
                return "°";
            case 156:
            case 157:
                return "cm";
            case 158:
                return "km/h";
            case 159:
                return "°C";
            case 162:
                return "°";
            case 164:
                return "%";
            case 165:
                return "mA";
            case 166:
                return "°/s";
            case 167:
                return "mOhm";
            case 168:
                return "%";
            case 169:
                return "mV";
            case 170:
                return "g";
            case 171:
                return "g";
            case 172:
                return "mg/km";
            case 173:
                return "mg/s";
            case 174:
                return "l/1000km";
            case 175:
                return "bar";
            case 176:
                return "ppm";
            case 177:
                return "Nm";
            case 178:
                return "°/s";
            case 180:
                return "Kg/h";
            case 181:
                return "mg/s";
        }
    }

    public static void m(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final float n(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int o(float f10, int i10, int i11) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }

    public static void p(FloatingEditText floatingEditText) {
        if (floatingEditText != null) {
            ((InputMethodManager) floatingEditText.getContext().getSystemService("input_method")).showSoftInput(floatingEditText, 0);
        }
    }

    public static final void q(String message) {
        kotlin.jvm.internal.i.e(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void r(String message) {
        kotlin.jvm.internal.i.e(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void s(String message) {
        kotlin.jvm.internal.i.e(message, "message");
        throw new NoSuchElementException(message);
    }

    public static String t(int i10) {
        Object[] objArr = {Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d)};
        int i11 = A.f40996a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final String u(short s10) {
        int i10 = s10 & 65535;
        return Integer.compareUnsigned(i10, 256) < 0 ? String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)) : String.format("%04X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
    }

    public static final ArrayList v(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                kotlin.jvm.internal.i.d(string, "getString(...)");
                arrayList.add(string);
            }
        } catch (Throwable th) {
            O.e.m(th);
        }
        return arrayList;
    }

    public static Class w(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    @Override // F3.a
    public File b(A3.b bVar) {
        return null;
    }

    @Override // F3.a
    public void a(A3.b bVar, D3.e eVar) {
    }
}
