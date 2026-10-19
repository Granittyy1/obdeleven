package com.voltasit.obdeleven.models;

import V8.o;
import X8.s;
import com.voltasit.obdeleven.presentation.appList.AppListFragment;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q;
import com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.oca.AppFragment;
import com.voltasit.obdeleven.presentation.vehicle.gauges.GaugeFragment;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p060e9.n;
import p073f9.e;
import p073f9.g;
import p073f9.i;
import p073f9.l;
import p085g9.j;
import p097h9.r;
import p097h9.u;
import p097h9.x;
import p170n9.d;
import p170n9.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class MenuOption {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MenuOption f31149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MenuOption f31150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MenuOption f31151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MenuOption f31152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final MenuOption f31153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MenuOption f31154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MenuOption f31155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final MenuOption f31156i;
    public static final MenuOption j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final MenuOption f31157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final MenuOption f31158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final MenuOption f31159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MenuOption f31160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final MenuOption f31161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final MenuOption f31162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final MenuOption f31163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final MenuOption f31164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final MenuOption f31165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final MenuOption f31166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ MenuOption[] f31167u;
    private final Class<?> defaultClass;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$1, reason: invalid class name */
    public final enum AnonymousClass1 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == f.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$10, reason: invalid class name */
    public final enum AnonymousClass10 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == r.class || baseFragment.getClass() == u.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$11, reason: invalid class name */
    public final enum AnonymousClass11 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == e.class || baseFragment.getClass() == l.class || baseFragment.getClass() == i.class || baseFragment.getClass() == p060e9.e.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$2, reason: invalid class name */
    public final enum AnonymousClass2 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == q.class || baseFragment.getClass() == d.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$3, reason: invalid class name */
    public final enum AnonymousClass3 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == a.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$4, reason: invalid class name */
    public final enum AnonymousClass4 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == OnlineControlUnitAdaptationFragment.class || baseFragment.getClass() == k.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$5, reason: invalid class name */
    public final enum AnonymousClass5 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$6, reason: invalid class name */
    public final enum AnonymousClass6 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == p022b9.f.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$7, reason: invalid class name */
    public final enum AnonymousClass7 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == p170n9.e.class || baseFragment.getClass() == n.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$8, reason: invalid class name */
    public final enum AnonymousClass8 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == AppFragment.class;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.MenuOption$9, reason: invalid class name */
    public final enum AnonymousClass9 extends MenuOption {
        @Override // com.voltasit.obdeleven.models.MenuOption
        public final boolean a(BaseFragment baseFragment) {
            return super.a(baseFragment) || baseFragment.getClass() == GaugeFragment.class;
        }
    }

    static {
        MenuOption menuOption = new MenuOption("CONTROL_UNIT_INFO", 0, ControlUnitInfoFragment.class);
        f31149b = menuOption;
        MenuOption menuOption2 = new MenuOption("CONTROL_UNIT_FAULTS", 1, FaultsFragment.class);
        f31150c = menuOption2;
        MenuOption menuOption3 = new MenuOption("UDS_ADVANCED_INFO", 2, p182o9.e.class);
        f31151d = menuOption3;
        MenuOption menuOption4 = new MenuOption("SUBSYSTEM", 3, o.class);
        f31152e = menuOption4;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("LIVE_DATA", 4, p182o9.f.class);
        f31153f = anonymousClass1;
        MenuOption menuOption5 = new MenuOption("CONTROL_UNIT_CODING", 5, m.class);
        f31154g = menuOption5;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("UDS_LONG_CODING", 6, s.class);
        f31155h = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("UDS_ADAPTATIONS", 7, h.class);
        f31156i = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("CONTROL_UNIT_ADAPTATION", 8, a.class);
        j = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("UDS_BASIC_SETTINGS", 9, UDSBasicSettingsFragment.class);
        f31157k = anonymousClass5;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6("UDS_OUTPUT_TEST", 10, UDSOutputTestFragment.class);
        f31158l = anonymousClass6;
        MenuOption menuOption6 = new MenuOption("CONTROL_UNIT_READINESS", 11, p170n9.f.class);
        f31159m = menuOption6;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7("VEHICLE_HISTORY_FRAGMENT", 12, VehicleHistoryFragment.class);
        f31160n = anonymousClass7;
        MenuOption menuOption7 = new MenuOption("VEHICLE_INFO", 13, VehicleInfoFragment.class);
        f31161o = menuOption7;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8("APPS", 14, AppListFragment.class);
        f31162p = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9("GAUGES", 15, j.class);
        f31163q = anonymousClass9;
        AnonymousClass10 anonymousClass10 = new AnonymousClass10("MANUALS", 16, x.class);
        f31164r = anonymousClass10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11("CHARTS", 17, g.class);
        f31165s = anonymousClass11;
        MenuOption menuOption8 = new MenuOption("UNKNOWN", 18, null);
        f31166t = menuOption8;
        f31167u = new MenuOption[]{menuOption, menuOption2, menuOption3, menuOption4, anonymousClass1, menuOption5, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5, anonymousClass6, menuOption6, anonymousClass7, menuOption7, anonymousClass8, anonymousClass9, anonymousClass10, anonymousClass11, menuOption8};
    }

    public MenuOption(String str, int i10, Class cls) {
        super(str, i10);
        this.defaultClass = cls;
    }

    public static MenuOption valueOf(String str) {
        return (MenuOption) Enum.valueOf(MenuOption.class, str);
    }

    public static MenuOption[] values() {
        return (MenuOption[]) f31167u.clone();
    }

    public boolean a(BaseFragment baseFragment) {
        return baseFragment.getClass() == this.defaultClass;
    }
}
