package com.voltasit.obdeleven;

import B8.A;
import B8.A0;
import B8.A1;
import B8.AbstractC0620c1;
import B8.C;
import B8.C0;
import B8.C0615b;
import B8.C0616b0;
import B8.C0617b1;
import B8.C0617b1.a;
import B8.C0618c;
import B8.C0622d0;
import B8.C0623e;
import B8.C0624e0;
import B8.C0627g;
import B8.C0628g0;
import B8.C0631i;
import B8.C0632i0;
import B8.C0635k;
import B8.C0636k0;
import B8.C0639m;
import B8.C0640m0;
import B8.C0643o;
import B8.C0644o0;
import B8.C0647q;
import B8.C0648q0;
import B8.C0650s;
import B8.C0651s0;
import B8.C0654u;
import B8.C0655u0;
import B8.C0658w;
import B8.C0659w0;
import B8.C0662y;
import B8.C0663y0;
import B8.C1;
import B8.E;
import B8.F0;
import B8.G;
import B8.H0;
import B8.I;
import B8.J0;
import B8.K;
import B8.L;
import B8.L0;
import B8.N;
import B8.N0;
import B8.P;
import B8.P0;
import B8.Q;
import B8.R0;
import B8.T;
import B8.T0;
import B8.V;
import B8.V0;
import B8.X;
import B8.X0;
import B8.Z;
import B8.Z0;
import B8.d1;
import B8.f1;
import B8.h1;
import B8.j1;
import B8.l1;
import B8.n1;
import B8.p1;
import B8.r1;
import B8.t1;
import B8.v1;
import B8.w1;
import B8.y1;
import M0.c;
import M0.d;
import M0.h;
import U1.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f29636a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f29637a;

        static {
            HashMap<String, Integer> map = new HashMap<>(68);
            f29637a = map;
            Integer numValueOf = Integer.valueOf(R.layout.activity_notification);
            map.put("layout/activity_notification_0", numValueOf);
            map.put("layout-land/activity_notification_0", numValueOf);
            map.put("layout/bottom_sheet_device_selection_0", Integer.valueOf(R.layout.bottom_sheet_device_selection));
            map.put("layout/chart_value_dialog_0", Integer.valueOf(R.layout.chart_value_dialog));
            f.b(R.layout.control_unit_faults_fragment, map, "layout/control_unit_faults_fragment_0", R.layout.control_unit_fragment, "layout/control_unit_fragment_0");
            f.b(R.layout.device_fragment, map, "layout/device_fragment_0", R.layout.device_fragment_list_item, "layout/device_fragment_list_item_0");
            f.b(R.layout.dialog_autocode_progress, map, "layout/dialog_autocode_progress_0", R.layout.dialog_backup, "layout/dialog_backup_0");
            f.b(R.layout.dialog_bonus, map, "layout/dialog_bonus_0", R.layout.dialog_change_device_password, "layout/dialog_change_device_password_0");
            f.b(R.layout.dialog_chart_save, map, "layout/dialog_chart_save_0", R.layout.dialog_eeprom_coding, "layout/dialog_eeprom_coding_0");
            f.b(R.layout.dialog_fragment_recycler_list, map, "layout/dialog_fragment_recycler_list_0", R.layout.dialog_number_label, "layout/dialog_number_label_0");
            f.b(R.layout.dialog_pro, map, "layout/dialog_pro_0", R.layout.dialog_security, "layout/dialog_security_0");
            f.b(R.layout.dialog_simple, map, "layout/dialog_simple_0", R.layout.dialog_twitter_login, "layout/dialog_twitter_login_0");
            map.put("layout/dialog_update_0", Integer.valueOf(R.layout.dialog_update));
            Integer numValueOf2 = Integer.valueOf(R.layout.fragment_about);
            map.put("layout/fragment_about_0", numValueOf2);
            map.put("layout-land/fragment_about_0", numValueOf2);
            map.put("layout/fragment_app_0", Integer.valueOf(R.layout.fragment_app));
            f.b(R.layout.fragment_app_list, map, "layout/fragment_app_list_0", R.layout.fragment_compose, "layout/fragment_compose_0");
            f.b(R.layout.fragment_control_unit_info, map, "layout/fragment_control_unit_info_0", R.layout.fragment_control_unit_list, "layout/fragment_control_unit_list_0");
            f.b(R.layout.fragment_disable_two_factor_auth_backup, map, "layout/fragment_disable_two_factor_auth_backup_0", R.layout.fragment_empty, "layout/fragment_empty_0");
            f.b(R.layout.fragment_input_eeprom, map, "layout/fragment_input_eeprom_0", R.layout.fragment_main, "layout/fragment_main_0");
            f.b(R.layout.fragment_profile, map, "layout/fragment_profile_0", R.layout.fragment_settings, "layout/fragment_settings_0");
            f.b(R.layout.fragment_signin, map, "layout/fragment_signin_0", R.layout.fragment_signup, "layout/fragment_signup_0");
            f.b(R.layout.fragment_two_factor_auth_activated, map, "layout/fragment_two_factor_auth_activated_0", R.layout.fragment_two_factor_auth_backup, "layout/fragment_two_factor_auth_backup_0");
            f.b(R.layout.fragment_two_factor_auth_intro, map, "layout/fragment_two_factor_auth_intro_0", R.layout.fragment_two_factor_auth_setup, "layout/fragment_two_factor_auth_setup_0");
            f.b(R.layout.fragment_two_factor_auth_verify, map, "layout/fragment_two_factor_auth_verify_0", R.layout.fragment_uds_data, "layout/fragment_uds_data_0");
            f.b(R.layout.fragment_vehicle, map, "layout/fragment_vehicle_0", R.layout.fragment_vehicle_history, "layout/fragment_vehicle_history_0");
            f.b(R.layout.fragment_vehicle_info, map, "layout/fragment_vehicle_info_0", R.layout.fragment_vehicle_list, "layout/fragment_vehicle_list_0");
            f.b(R.layout.full_screen_dialog, map, "layout/full_screen_dialog_0", R.layout.item_add_oca, "layout/item_add_oca_0");
            f.b(R.layout.item_autocode_progress, map, "layout/item_autocode_progress_0", R.layout.item_bit_checkbox, "layout/item_bit_checkbox_0");
            f.b(R.layout.item_button_bottom, map, "layout/item_button_bottom_0", R.layout.item_control_unit, "layout/item_control_unit_0");
            f.b(R.layout.item_country, map, "layout/item_country_0", R.layout.item_edit_text, "layout/item_edit_text_0");
            f.b(R.layout.item_labeled_button, map, "layout/item_labeled_button_0", R.layout.item_labeled_button_info, "layout/item_labeled_button_info_0");
            f.b(R.layout.item_labeled_checkbox, map, "layout/item_labeled_checkbox_0", R.layout.item_profile_button, "layout/item_profile_button_0");
            f.b(R.layout.item_uds, map, "layout/item_uds_0", R.layout.item_vehicle, "layout/item_vehicle_0");
            f.b(R.layout.labeled_button_binding, map, "layout/labeled_button_binding_0", R.layout.list_device_name, "layout/list_device_name_0");
            f.b(R.layout.list_dialog, map, "layout/list_dialog_0", R.layout.list_dialog_item, "layout/list_dialog_item_0");
            f.b(R.layout.startup_activity, map, "layout/startup_activity_0", R.layout.uds_data_list_fragment, "layout/uds_data_list_fragment_0");
            f.b(R.layout.vehicle_history_scan_fragment, map, "layout/vehicle_history_scan_fragment_0", R.layout.view_simple_yes_no_dialog, "layout/view_simple_yes_no_dialog_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(66);
        f29636a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_notification, 1);
        sparseIntArray.put(R.layout.bottom_sheet_device_selection, 2);
        sparseIntArray.put(R.layout.chart_value_dialog, 3);
        sparseIntArray.put(R.layout.control_unit_faults_fragment, 4);
        sparseIntArray.put(R.layout.control_unit_fragment, 5);
        sparseIntArray.put(R.layout.device_fragment, 6);
        sparseIntArray.put(R.layout.device_fragment_list_item, 7);
        sparseIntArray.put(R.layout.dialog_autocode_progress, 8);
        sparseIntArray.put(R.layout.dialog_backup, 9);
        sparseIntArray.put(R.layout.dialog_bonus, 10);
        sparseIntArray.put(R.layout.dialog_change_device_password, 11);
        sparseIntArray.put(R.layout.dialog_chart_save, 12);
        sparseIntArray.put(R.layout.dialog_eeprom_coding, 13);
        sparseIntArray.put(R.layout.dialog_fragment_recycler_list, 14);
        sparseIntArray.put(R.layout.dialog_number_label, 15);
        sparseIntArray.put(R.layout.dialog_pro, 16);
        sparseIntArray.put(R.layout.dialog_security, 17);
        sparseIntArray.put(R.layout.dialog_simple, 18);
        sparseIntArray.put(R.layout.dialog_twitter_login, 19);
        sparseIntArray.put(R.layout.dialog_update, 20);
        sparseIntArray.put(R.layout.fragment_about, 21);
        sparseIntArray.put(R.layout.fragment_app, 22);
        sparseIntArray.put(R.layout.fragment_app_list, 23);
        sparseIntArray.put(R.layout.fragment_compose, 24);
        sparseIntArray.put(R.layout.fragment_control_unit_info, 25);
        sparseIntArray.put(R.layout.fragment_control_unit_list, 26);
        sparseIntArray.put(R.layout.fragment_disable_two_factor_auth_backup, 27);
        sparseIntArray.put(R.layout.fragment_empty, 28);
        sparseIntArray.put(R.layout.fragment_input_eeprom, 29);
        sparseIntArray.put(R.layout.fragment_main, 30);
        sparseIntArray.put(R.layout.fragment_profile, 31);
        sparseIntArray.put(R.layout.fragment_settings, 32);
        sparseIntArray.put(R.layout.fragment_signin, 33);
        sparseIntArray.put(R.layout.fragment_signup, 34);
        sparseIntArray.put(R.layout.fragment_two_factor_auth_activated, 35);
        sparseIntArray.put(R.layout.fragment_two_factor_auth_backup, 36);
        sparseIntArray.put(R.layout.fragment_two_factor_auth_intro, 37);
        sparseIntArray.put(R.layout.fragment_two_factor_auth_setup, 38);
        sparseIntArray.put(R.layout.fragment_two_factor_auth_verify, 39);
        sparseIntArray.put(R.layout.fragment_uds_data, 40);
        sparseIntArray.put(R.layout.fragment_vehicle, 41);
        sparseIntArray.put(R.layout.fragment_vehicle_history, 42);
        sparseIntArray.put(R.layout.fragment_vehicle_info, 43);
        sparseIntArray.put(R.layout.fragment_vehicle_list, 44);
        sparseIntArray.put(R.layout.full_screen_dialog, 45);
        sparseIntArray.put(R.layout.item_add_oca, 46);
        sparseIntArray.put(R.layout.item_autocode_progress, 47);
        sparseIntArray.put(R.layout.item_bit_checkbox, 48);
        sparseIntArray.put(R.layout.item_button_bottom, 49);
        sparseIntArray.put(R.layout.item_control_unit, 50);
        sparseIntArray.put(R.layout.item_country, 51);
        sparseIntArray.put(R.layout.item_edit_text, 52);
        sparseIntArray.put(R.layout.item_labeled_button, 53);
        sparseIntArray.put(R.layout.item_labeled_button_info, 54);
        sparseIntArray.put(R.layout.item_labeled_checkbox, 55);
        sparseIntArray.put(R.layout.item_profile_button, 56);
        sparseIntArray.put(R.layout.item_uds, 57);
        sparseIntArray.put(R.layout.item_vehicle, 58);
        sparseIntArray.put(R.layout.labeled_button_binding, 59);
        sparseIntArray.put(R.layout.list_device_name, 60);
        sparseIntArray.put(R.layout.list_dialog, 61);
        sparseIntArray.put(R.layout.list_dialog_item, 62);
        sparseIntArray.put(R.layout.startup_activity, 63);
        sparseIntArray.put(R.layout.uds_data_list_fragment, 64);
        sparseIntArray.put(R.layout.vehicle_history_scan_fragment, 65);
        sparseIntArray.put(R.layout.view_simple_yes_no_dialog, 66);
    }

    @Override // M0.c
    public final List<c> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // M0.c
    public final h b(d dVar, View view, int i10) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        int i11 = f29636a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            int i12 = (i11 - 1) / 50;
            if (i12 == 0) {
                switch (i11) {
                    case 1:
                        if ("layout/activity_notification_0".equals(tag)) {
                            return new C0615b(dVar, view);
                        }
                        if ("layout-land/activity_notification_0".equals(tag)) {
                            return new C0618c(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for activity_notification is invalid. Received: "));
                    case 2:
                        if ("layout/bottom_sheet_device_selection_0".equals(tag)) {
                            return new C0623e(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for bottom_sheet_device_selection is invalid. Received: "));
                    case 3:
                        if ("layout/chart_value_dialog_0".equals(tag)) {
                            return new C0627g(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for chart_value_dialog is invalid. Received: "));
                    case 4:
                        if (!"layout/control_unit_faults_fragment_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for control_unit_faults_fragment is invalid. Received: "));
                        }
                        Object[] objArrK = h.k(dVar, view, 8, null, C0631i.f1955A);
                        C0631i c0631i = new C0631i(dVar, view, (TextView) objArrK[2], (FloatingActionButton) objArrK[7], (ShapeableImageView) objArrK[4], (FrameLayout) objArrK[3], (Spinner) objArrK[6], (RecyclerView) objArrK[1], (TextView) objArrK[5], (SwipeRefreshLayout) objArrK[0]);
                        c0631i.f1956z = -1L;
                        c0631i.f1934y.setTag(null);
                        c0631i.r(view);
                        c0631i.i();
                        return c0631i;
                    case 5:
                        if ("layout/control_unit_fragment_0".equals(tag)) {
                            return new C0635k(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for control_unit_fragment is invalid. Received: "));
                    case 6:
                        if ("layout/device_fragment_0".equals(tag)) {
                            return new C0639m(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for device_fragment is invalid. Received: "));
                    case 7:
                        if ("layout/device_fragment_list_item_0".equals(tag)) {
                            return new C0643o(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for device_fragment_list_item is invalid. Received: "));
                    case 8:
                        if ("layout/dialog_autocode_progress_0".equals(tag)) {
                            return new C0647q(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_autocode_progress is invalid. Received: "));
                    case 9:
                        if ("layout/dialog_backup_0".equals(tag)) {
                            return new C0650s(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_backup is invalid. Received: "));
                    case 10:
                        if ("layout/dialog_bonus_0".equals(tag)) {
                            return new C0654u(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_bonus is invalid. Received: "));
                    case 11:
                        if ("layout/dialog_change_device_password_0".equals(tag)) {
                            return new C0658w(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_change_device_password is invalid. Received: "));
                    case 12:
                        if ("layout/dialog_chart_save_0".equals(tag)) {
                            return new C0662y(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_chart_save is invalid. Received: "));
                    case 13:
                        if ("layout/dialog_eeprom_coding_0".equals(tag)) {
                            return new A(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_eeprom_coding is invalid. Received: "));
                    case 14:
                        if ("layout/dialog_fragment_recycler_list_0".equals(tag)) {
                            return new C(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_fragment_recycler_list is invalid. Received: "));
                    case 15:
                        if ("layout/dialog_number_label_0".equals(tag)) {
                            return new E(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_number_label is invalid. Received: "));
                    case 16:
                        if ("layout/dialog_pro_0".equals(tag)) {
                            return new G(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_pro is invalid. Received: "));
                    case 17:
                        if ("layout/dialog_security_0".equals(tag)) {
                            return new I(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_security is invalid. Received: "));
                    case 18:
                        if ("layout/dialog_simple_0".equals(tag)) {
                            return new K(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_simple is invalid. Received: "));
                    case 19:
                        if ("layout/dialog_twitter_login_0".equals(tag)) {
                            return new L(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_twitter_login is invalid. Received: "));
                    case 20:
                        if (!"layout/dialog_update_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for dialog_update is invalid. Received: "));
                        }
                        Object[] objArrK2 = h.k(dVar, view, 5, null, N.f1756y);
                        N n10 = new N(dVar, view, (View) objArrK2[2], (Button) objArrK2[4], (TextView) objArrK2[1], (LinearLayout) objArrK2[0], (ProgressBar) objArrK2[3]);
                        n10.f1757x = -1L;
                        n10.f1751u.setTag(null);
                        n10.r(view);
                        n10.i();
                        hVar2 = n10;
                        return hVar2;
                    case 21:
                        if ("layout/fragment_about_0".equals(tag)) {
                            return new P(dVar, view);
                        }
                        if ("layout-land/fragment_about_0".equals(tag)) {
                            return new Q(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_about is invalid. Received: "));
                    case 22:
                        if ("layout/fragment_app_0".equals(tag)) {
                            return new T(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_app is invalid. Received: "));
                    case 23:
                        if ("layout/fragment_app_list_0".equals(tag)) {
                            return new V(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_app_list is invalid. Received: "));
                    case 24:
                        if (!"layout/fragment_compose_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_compose is invalid. Received: "));
                        }
                        X x10 = new X(dVar, view, (ComposeView) h.k(dVar, view, 1, null, null)[0]);
                        x10.f1831s = -1L;
                        x10.f1823r.setTag(null);
                        view.setTag(R.id.dataBinding, x10);
                        x10.i();
                        hVar = x10;
                        return hVar;
                    case 25:
                        if ("layout/fragment_control_unit_info_0".equals(tag)) {
                            return new Z(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_control_unit_info is invalid. Received: "));
                    case 26:
                        if (!"layout/fragment_control_unit_list_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_control_unit_list is invalid. Received: "));
                        }
                        Object[] objArrK3 = h.k(dVar, view, 3, null, C0616b0.f1866v);
                        C0616b0 c0616b0 = new C0616b0(dVar, view, (FloatingActionButton) objArrK3[2], (RecyclerView) objArrK3[1], (SwipeRefreshLayout) objArrK3[0]);
                        c0616b0.f1867u = -1L;
                        c0616b0.f1856t.setTag(null);
                        view.setTag(R.id.dataBinding, c0616b0);
                        c0616b0.i();
                        return c0616b0;
                    case 27:
                        if ("layout/fragment_disable_two_factor_auth_backup_0".equals(tag)) {
                            return new C0622d0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_disable_two_factor_auth_backup is invalid. Received: "));
                    case 28:
                        if (!"layout/fragment_empty_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_empty is invalid. Received: "));
                        }
                        Object[] objArrK4 = h.k(dVar, view, 1, null, null);
                        C0624e0 c0624e0 = new C0624e0(view, 0, dVar);
                        c0624e0.f1897r = -1L;
                        ((FrameLayout) objArrK4[0]).setTag(null);
                        c0624e0.r(view);
                        c0624e0.i();
                        hVar = c0624e0;
                        return hVar;
                    case 29:
                        if ("layout/fragment_input_eeprom_0".equals(tag)) {
                            return new C0628g0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_input_eeprom is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        if ("layout/fragment_main_0".equals(tag)) {
                            return new C0632i0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_main is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        if ("layout/fragment_profile_0".equals(tag)) {
                            return new C0636k0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_profile is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        if ("layout/fragment_settings_0".equals(tag)) {
                            return new C0640m0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_settings is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        if ("layout/fragment_signin_0".equals(tag)) {
                            return new C0644o0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_signin is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        if ("layout/fragment_signup_0".equals(tag)) {
                            return new C0648q0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_signup is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        if ("layout/fragment_two_factor_auth_activated_0".equals(tag)) {
                            return new C0651s0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_two_factor_auth_activated is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        if ("layout/fragment_two_factor_auth_backup_0".equals(tag)) {
                            return new C0655u0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_two_factor_auth_backup is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        if (!"layout/fragment_two_factor_auth_intro_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_two_factor_auth_intro is invalid. Received: "));
                        }
                        Object[] objArrK5 = h.k(dVar, view, 11, null, C0659w0.f2178u);
                        TextView textView = (TextView) objArrK5[9];
                        Button button = (Button) objArrK5[10];
                        C0659w0 c0659w0 = new C0659w0(dVar, view, textView, button);
                        c0659w0.f2179t = -1L;
                        ((NestedScrollView) objArrK5[0]).setTag(null);
                        c0659w0.r(view);
                        c0659w0.i();
                        return c0659w0;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        if (!"layout/fragment_two_factor_auth_setup_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_two_factor_auth_setup is invalid. Received: "));
                        }
                        Object[] objArrK6 = h.k(dVar, view, 7, null, C0663y0.f2193w);
                        TextView textView2 = (TextView) objArrK6[3];
                        Button button2 = (Button) objArrK6[6];
                        Button button3 = (Button) objArrK6[5];
                        View view2 = (View) objArrK6[4];
                        C0663y0 c0663y0 = new C0663y0(dVar, view, textView2, button2, button3, view2);
                        c0663y0.f2194v = -1L;
                        ((NestedScrollView) objArrK6[0]).setTag(null);
                        c0663y0.r(view);
                        c0663y0.i();
                        return c0663y0;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        if (!"layout/fragment_two_factor_auth_verify_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_two_factor_auth_verify is invalid. Received: "));
                        }
                        Object[] objArrK7 = h.k(dVar, view, 11, null, A0.f1607A);
                        TextView textView3 = (TextView) objArrK7[9];
                        TextInputEditText textInputEditText = (TextInputEditText) objArrK7[6];
                        Button button4 = (Button) objArrK7[1];
                        A0 a10 = new A0(dVar, view, textView3, textInputEditText, button4, (TextView) objArrK7[7], (TextView) objArrK7[8], (View) objArrK7[10], (Toolbar) objArrK7[3]);
                        a10.f1608z = -1L;
                        a10.f2213t.setTag(null);
                        ((FrameLayout) objArrK7[0]).setTag(null);
                        a10.r(view);
                        a10.i();
                        return a10;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        if (!"layout/fragment_uds_data_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_uds_data is invalid. Received: "));
                        }
                        Object[] objArrK8 = h.k(dVar, view, 8, null, C0.f1630z);
                        C0 c10 = new C0(dVar, view, (LinearLayout) objArrK8[4], (RecyclerView) objArrK8[6], (TextView) objArrK8[5], (FloatingActionButton) objArrK8[7], (LinearLayout) objArrK8[1], (TextView) objArrK8[2], (Button) objArrK8[3]);
                        c10.f1631y = -1L;
                        ((FrameLayout) objArrK8[0]).setTag(null);
                        c10.r(view);
                        c10.i();
                        return c10;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        if ("layout/fragment_vehicle_0".equals(tag)) {
                            return new F0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_vehicle is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        if (!"layout/fragment_vehicle_history_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_vehicle_history is invalid. Received: "));
                        }
                        Object[] objArrK9 = h.k(dVar, view, 8, null, H0.f1699y);
                        H0 h8 = new H0(dVar, view, (TextView) objArrK9[2], (ShapeableImageView) objArrK9[4], (FrameLayout) objArrK9[3], (RecyclerView) objArrK9[1], (TextView) objArrK9[5], (TextView) objArrK9[6]);
                        h8.f1700x = -1L;
                        ((ConstraintLayout) objArrK9[0]).setTag(null);
                        h8.r(view);
                        h8.i();
                        return h8;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        if (!"layout/fragment_vehicle_info_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_vehicle_info is invalid. Received: "));
                        }
                        Object[] objArrK10 = h.k(dVar, view, 35, J0.f1730L, J0.f1731M);
                        AbstractC0620c1 abstractC0620c1 = (AbstractC0620c1) objArrK10[7];
                        View view3 = (View) objArrK10[17];
                        LinearLayout linearLayout = (LinearLayout) objArrK10[1];
                        View view4 = (View) objArrK10[14];
                        AbstractC0620c1 abstractC0620c2 = (AbstractC0620c1) objArrK10[8];
                        View view5 = (View) objArrK10[23];
                        AbstractC0620c1 abstractC0620c3 = (AbstractC0620c1) objArrK10[11];
                        View view6 = (View) objArrK10[26];
                        LinearLayout linearLayout2 = (LinearLayout) objArrK10[2];
                        AbstractC0620c1 abstractC0620c4 = (AbstractC0620c1) objArrK10[9];
                        View view7 = (View) objArrK10[24];
                        View view8 = (View) objArrK10[4];
                        AbstractC0620c1 abstractC0620c5 = (AbstractC0620c1) objArrK10[10];
                        View view9 = (View) objArrK10[25];
                        View view10 = (View) objArrK10[3];
                        J0 j10 = new J0(dVar, view, abstractC0620c1, view3, linearLayout, view4, abstractC0620c2, view5, abstractC0620c3, view6, linearLayout2, abstractC0620c4, view7, view8, abstractC0620c5, view9, view10, (AbstractC0620c1) objArrK10[5], (View) objArrK10[15], (AbstractC0620c1) objArrK10[6], (View) objArrK10[16]);
                        j10.f1732K = -1L;
                        ((ConstraintLayout) objArrK10[0]).setTag(null);
                        AbstractC0620c1 abstractC0620c6 = j10.f1716r;
                        if (abstractC0620c6 != null) {
                            abstractC0620c6.j = j10;
                        }
                        j10.f1718t.setTag(null);
                        AbstractC0620c1 abstractC0620c7 = j10.f1720v;
                        if (abstractC0620c7 != null) {
                            abstractC0620c7.j = j10;
                        }
                        AbstractC0620c1 abstractC0620c8 = j10.f1722x;
                        if (abstractC0620c8 != null) {
                            abstractC0620c8.j = j10;
                        }
                        j10.f1724z.setTag(null);
                        AbstractC0620c1 abstractC0620c9 = j10.f1706A;
                        if (abstractC0620c9 != null) {
                            abstractC0620c9.j = j10;
                        }
                        AbstractC0620c1 abstractC0620c10 = j10.f1709D;
                        if (abstractC0620c10 != null) {
                            abstractC0620c10.j = j10;
                        }
                        AbstractC0620c1 abstractC0620c11 = j10.f1712G;
                        if (abstractC0620c11 != null) {
                            abstractC0620c11.j = j10;
                        }
                        AbstractC0620c1 abstractC0620c12 = j10.f1714I;
                        if (abstractC0620c12 != null) {
                            abstractC0620c12.j = j10;
                        }
                        j10.r(view);
                        j10.i();
                        return j10;
                    case 44:
                        if ("layout/fragment_vehicle_list_0".equals(tag)) {
                            return new L0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for fragment_vehicle_list is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        if (!"layout/full_screen_dialog_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for full_screen_dialog is invalid. Received: "));
                        }
                        Object[] objArrK11 = h.k(dVar, view, 4, null, N0.f1758v);
                        ComposeView composeView = (ComposeView) objArrK11[2];
                        N0 n11 = new N0(dVar, view, composeView, (Toolbar) objArrK11[1]);
                        n11.f1759u = -1L;
                        ((CoordinatorLayout) objArrK11[0]).setTag(null);
                        n11.r(view);
                        n11.i();
                        hVar = n11;
                        return hVar;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        if (!"layout/item_add_oca_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_add_oca is invalid. Received: "));
                        }
                        Object[] objArrK12 = h.k(dVar, view, 2, null, P0.f1781u);
                        P0 p10 = new P0(dVar, view, (TextView) objArrK12[1]);
                        p10.f1782t = -1L;
                        ((FrameLayout) objArrK12[0]).setTag(null);
                        p10.r(view);
                        p10.i();
                        hVar = p10;
                        return hVar;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        if (!"layout/item_autocode_progress_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_autocode_progress is invalid. Received: "));
                        }
                        Object[] objArrK13 = h.k(dVar, view, 4, null, R0.f1795v);
                        R0 r10 = new R0(dVar, view, (ImageView) objArrK13[1], (ProgressBar) objArrK13[2], (TextView) objArrK13[3]);
                        r10.f1796u = -1L;
                        ((LinearLayout) objArrK13[0]).setTag(null);
                        r10.r(view);
                        r10.i();
                        hVar2 = r10;
                        return hVar2;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        if (!"layout/item_bit_checkbox_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_bit_checkbox is invalid. Received: "));
                        }
                        Object[] objArrK14 = h.k(dVar, view, 2, null, T0.f1809t);
                        LinearLayout linearLayout3 = (LinearLayout) objArrK14[0];
                        T0 t8 = new T0(dVar, view, linearLayout3);
                        t8.f1810s = -1L;
                        t8.f1806r.setTag(null);
                        view.setTag(R.id.dataBinding, t8);
                        t8.i();
                        hVar = t8;
                        return hVar;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        if ("layout/item_button_bottom_0".equals(tag)) {
                            return new V0(dVar, view);
                        }
                        throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_button_bottom is invalid. Received: "));
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorAccent /* 50 */:
                        if (!"layout/item_control_unit_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_control_unit is invalid. Received: "));
                        }
                        Object[] objArrK15 = h.k(dVar, view, 6, null, X0.f1832z);
                        X0 x11 = new X0(dVar, view, (ShapeableImageView) objArrK15[4], (FrameLayout) objArrK15[3], (TextView) objArrK15[1], (TextView) objArrK15[2], (ProgressBar) objArrK15[5]);
                        x11.f1833y = -1L;
                        ((FrameLayout) objArrK15[0]).setTag(null);
                        x11.f1827t.setTag(null);
                        x11.f1828u.setTag(null);
                        x11.r(view);
                        x11.i();
                        hVar2 = x11;
                        return hVar2;
                    default:
                        return null;
                }
            }
            if (i12 == 1) {
                switch (i11) {
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (!"layout/item_country_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_country is invalid. Received: "));
                        }
                        Object[] objArrK16 = h.k(dVar, view, 5, null, Z0.f1845w);
                        ImageView imageView = (ImageView) objArrK16[2];
                        Z0 z10 = new Z0(dVar, view, imageView, (TextView) objArrK16[4], (TextView) objArrK16[3]);
                        z10.f1846v = -1L;
                        ((ConstraintLayout) objArrK16[0]).setTag(null);
                        z10.r(view);
                        z10.i();
                        hVar3 = z10;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (!"layout/item_edit_text_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_edit_text is invalid. Received: "));
                        }
                        Object[] objArrK17 = h.k(dVar, view, 2, null, null);
                        C0617b1 c0617b1 = new C0617b1(dVar, view, (EditText) objArrK17[1], (TextInputLayout) objArrK17[0]);
                        c0617b1.f1868v = c0617b1.new a();
                        c0617b1.f1869w = -1L;
                        c0617b1.f1857r.setTag(null);
                        c0617b1.f1858s.setTag(null);
                        view.setTag(R.id.dataBinding, c0617b1);
                        c0617b1.i();
                        hVar4 = c0617b1;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (!"layout/item_labeled_button_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_labeled_button is invalid. Received: "));
                        }
                        Object[] objArrK18 = h.k(dVar, view, 3, null, d1.f1893u);
                        d1 d1Var = new d1(dVar, view, (TextView) objArrK18[2], (TextView) objArrK18[1]);
                        d1Var.f1894t = -1L;
                        ((LinearLayout) objArrK18[0]).setTag(null);
                        d1Var.r(view);
                        d1Var.i();
                        hVar4 = d1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (!"layout/item_labeled_button_info_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_labeled_button_info is invalid. Received: "));
                        }
                        Object[] objArrK19 = h.k(dVar, view, 4, null, f1.f1916x);
                        f1 f1Var = new f1(dVar, view, (TextView) objArrK19[3], (TextView) objArrK19[1], (TextView) objArrK19[2]);
                        f1Var.f1917w = -1L;
                        f1Var.f1900s.setTag(null);
                        ((LinearLayout) objArrK19[0]).setTag(null);
                        f1Var.f1901t.setTag(null);
                        f1Var.r(view);
                        f1Var.i();
                        hVar3 = f1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (!"layout/item_labeled_checkbox_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_labeled_checkbox is invalid. Received: "));
                        }
                        Object[] objArrK20 = h.k(dVar, view, 4, null, h1.f1953w);
                        h1 h1Var = new h1(dVar, view, (AppCompatCheckBox) objArrK20[3], (TextView) objArrK20[1], (LinearLayout) objArrK20[0], (TextView) objArrK20[2]);
                        h1Var.f1954v = -1L;
                        h1Var.f1925t.setTag(null);
                        view.setTag(R.id.dataBinding, h1Var);
                        h1Var.i();
                        hVar3 = h1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorError /* 56 */:
                        if (!"layout/item_profile_button_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_profile_button is invalid. Received: "));
                        }
                        j1 j1Var = new j1(dVar, view, (Button) h.k(dVar, view, 1, null, null)[0]);
                        j1Var.f1986t = -1L;
                        j1Var.f1966r.setTag(null);
                        view.setTag(R.id.dataBinding, j1Var);
                        j1Var.i();
                        hVar4 = j1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (!"layout/item_uds_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_uds is invalid. Received: "));
                        }
                        Object[] objArrK21 = h.k(dVar, view, 5, null, l1.f2038w);
                        l1 l1Var = new l1(dVar, view, (LinearLayout) objArrK21[3], (ProgressBar) objArrK21[4], (AppCompatImageView) objArrK21[2], (TextView) objArrK21[1]);
                        l1Var.f2039v = -1L;
                        ((LinearLayout) objArrK21[0]).setTag(null);
                        l1Var.r(view);
                        l1Var.i();
                        hVar3 = l1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (!"layout/item_vehicle_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for item_vehicle is invalid. Received: "));
                        }
                        Object[] objArrK22 = h.k(dVar, view, 7, null, n1.f2082z);
                        FrameLayout frameLayout = (FrameLayout) objArrK22[0];
                        ShapeableImageView shapeableImageView = (ShapeableImageView) objArrK22[2];
                        n1 n1Var = n1Var;
                        n1 n1Var2 = new n1(dVar, view, frameLayout, shapeableImageView, (TextView) objArrK22[4], (ProgressBar) objArrK22[3], (TextView) objArrK22[6], (TextView) objArrK22[5]);
                        n1Var.f2083y = -1L;
                        n1Var.f2069r.setTag(null);
                        view.setTag(R.id.dataBinding, n1Var);
                        n1Var.i();
                        hVar3 = n1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!"layout/labeled_button_binding_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for labeled_button_binding is invalid. Received: "));
                        }
                        Object[] objArrK23 = h.k(dVar, view, 3, null, null);
                        p1 p1Var = new p1(dVar, view, (TextView) objArrK23[2], (TextView) objArrK23[1]);
                        p1Var.f2100v = -1L;
                        ((LinearLayout) objArrK23[0]).setTag(null);
                        p1Var.f2091r.setTag(null);
                        p1Var.f2092s.setTag(null);
                        p1Var.r(view);
                        p1Var.i();
                        hVar4 = p1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        if (!"layout/list_device_name_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for list_device_name is invalid. Received: "));
                        }
                        Object[] objArrK24 = h.k(dVar, view, 4, null, r1.f2133w);
                        r1 r1Var = new r1(dVar, view, (ImageView) objArrK24[3], (TextView) objArrK24[2], (TextView) objArrK24[1]);
                        r1Var.f2134v = -1L;
                        r1Var.f2105r.setTag(null);
                        r1Var.f2106s.setTag(null);
                        ((LinearLayout) objArrK24[0]).setTag(null);
                        r1Var.r(view);
                        r1Var.i();
                        hVar3 = r1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!"layout/list_dialog_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for list_dialog is invalid. Received: "));
                        }
                        Object[] objArrK25 = h.k(dVar, view, 6, null, t1.f2158y);
                        t1 t1Var = new t1(dVar, view, (EditText) objArrK25[3], (Button) objArrK25[5], (Button) objArrK25[4], (RecyclerView) objArrK25[1], (ProgressBar) objArrK25[2]);
                        t1Var.f2159x = -1L;
                        t1Var.f2143u.setTag(null);
                        t1Var.f2144v.setTag(null);
                        ((LinearLayout) objArrK25[0]).setTag(null);
                        t1Var.r(view);
                        t1Var.i();
                        hVar3 = t1Var;
                        return hVar3;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (!"layout/list_dialog_item_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for list_dialog_item is invalid. Received: "));
                        }
                        Object[] objArrK26 = h.k(dVar, view, 3, null, null);
                        v1 v1Var = new v1(dVar, view, (CheckedTextView) objArrK26[1], (TextView) objArrK26[2]);
                        v1Var.f2175u = -1L;
                        v1Var.f2165r.setTag(null);
                        v1Var.f2166s.setTag(null);
                        ((FrameLayout) objArrK26[0]).setTag(null);
                        v1Var.r(view);
                        v1Var.i();
                        hVar4 = v1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        if (!"layout/startup_activity_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for startup_activity is invalid. Received: "));
                        }
                        Object[] objArrK27 = h.k(dVar, view, 1, null, null);
                        w1 w1Var = new w1(view, 0, dVar);
                        w1Var.f2180r = -1L;
                        ((ConstraintLayout) objArrK27[0]).setTag(null);
                        w1Var.r(view);
                        w1Var.i();
                        hVar4 = w1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        if (!"layout/uds_data_list_fragment_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for uds_data_list_fragment is invalid. Received: "));
                        }
                        Object[] objArrK28 = h.k(dVar, view, 3, null, y1.f2195u);
                        y1 y1Var = new y1(dVar, view, (FloatingActionButton) objArrK28[2], (RecyclerView) objArrK28[1]);
                        y1Var.f2196t = -1L;
                        ((FrameLayout) objArrK28[0]).setTag(null);
                        y1Var.r(view);
                        y1Var.i();
                        hVar4 = y1Var;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (!"layout/vehicle_history_scan_fragment_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for vehicle_history_scan_fragment is invalid. Received: "));
                        }
                        Object[] objArrK29 = h.k(dVar, view, 2, null, A1.f1609t);
                        A1 a11 = new A1(dVar, view, (RecyclerView) objArrK29[1]);
                        a11.f1610s = -1L;
                        ((FrameLayout) objArrK29[0]).setTag(null);
                        a11.r(view);
                        a11.i();
                        hVar4 = a11;
                        return hVar4;
                    case me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (!"layout/view_simple_yes_no_dialog_0".equals(tag)) {
                            throw new IllegalArgumentException(coil.intercept.a.a(tag, "The tag for view_simple_yes_no_dialog is invalid. Received: "));
                        }
                        Object[] objArrK30 = h.k(dVar, view, 3, null, C1.f1632w);
                        C1 c11 = new C1(dVar, view, (TextView) objArrK30[2], (TextView) objArrK30[1]);
                        c11.f1633v = -1L;
                        ((LinearLayout) objArrK30[0]).setTag(null);
                        c11.f1626s.setTag(null);
                        c11.r(view);
                        c11.i();
                        hVar4 = c11;
                        return hVar4;
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    @Override // M0.c
    public final h c(d dVar, View[] viewArr, int i10) {
        if (viewArr.length != 0 && f29636a.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // M0.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = a.f29637a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
