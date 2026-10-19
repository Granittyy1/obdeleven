package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MaterialCalendar<S> extends z<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2030d<S> f27013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2027a f27014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC2032f f27015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f27016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CalendarSelector f27017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2029c f27018i;
    public RecyclerView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f27019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f27020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f27021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f27022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f27023o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CalendarSelector f27024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CalendarSelector f27025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CalendarSelector[] f27026d;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            f27024b = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            f27025c = calendarSelector2;
            f27026d = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public CalendarSelector() {
            throw null;
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) f27026d.clone();
        }
    }

    public class a extends C1286a {
        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            sVar.k(null);
        }
    }

    public class b extends B {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public final /* synthetic */ int f27027E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11) {
            super(i10);
            this.f27027E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void G0(RecyclerView.x xVar, int[] iArr) {
            int i10 = this.f27027E;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i10 == 0) {
                iArr[0] = materialCalendar.f27019k.getWidth();
                iArr[1] = materialCalendar.f27019k.getWidth();
            } else {
                iArr[0] = materialCalendar.f27019k.getHeight();
                iArr[1] = materialCalendar.f27019k.getHeight();
            }
        }
    }

    public class c {
        public c() {
        }
    }

    @Override // com.google.android.material.datepicker.z
    public final void o(q.c cVar) {
        this.f27139b.add(cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27012c = bundle.getInt("THEME_RES_ID_KEY");
        this.f27013d = (InterfaceC2030d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f27014e = (C2027a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27015f = (AbstractC2032f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f27016g = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        H h8;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f27012c);
        this.f27018i = new C2029c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar = this.f27014e.f27032b;
        if (q.y(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.voltasit.obdeleven.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.voltasit.obdeleven.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f27122h;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.voltasit.obdeleven.R.id.mtrl_calendar_days_of_week);
        O.n(gridView, new a());
        int i13 = this.f27014e.f27036f;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new g(i13) : new g()));
        gridView.setNumColumns(uVar.f27118e);
        gridView.setEnabled(false);
        this.f27019k = (RecyclerView) viewInflate.findViewById(com.voltasit.obdeleven.R.id.mtrl_calendar_months);
        getContext();
        this.f27019k.setLayoutManager(new b(i11, i11));
        this.f27019k.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f27013d, this.f27014e, this.f27015f, new c());
        this.f27019k.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.voltasit.obdeleven.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.voltasit.obdeleven.R.id.mtrl_calendar_year_selector_frame);
        this.j = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.j.setLayoutManager(new GridLayoutManager(integer, 0));
            this.j.setAdapter(new F(this));
            this.j.i(new k(this));
        }
        if (viewInflate.findViewById(com.voltasit.obdeleven.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.voltasit.obdeleven.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            O.n(materialButton, new U5.e(1, this));
            View viewFindViewById = viewInflate.findViewById(com.voltasit.obdeleven.R.id.month_navigation_previous);
            this.f27020l = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.voltasit.obdeleven.R.id.month_navigation_next);
            this.f27021m = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f27022n = viewInflate.findViewById(com.voltasit.obdeleven.R.id.mtrl_calendar_year_selector_frame);
            this.f27023o = viewInflate.findViewById(com.voltasit.obdeleven.R.id.mtrl_calendar_day_selector_frame);
            q(CalendarSelector.f27024b);
            materialButton.setText(this.f27016g.c());
            this.f27019k.j(new l(this, xVar, materialButton));
            materialButton.setOnClickListener(new m(this));
            this.f27021m.setOnClickListener(new n(this, xVar));
            this.f27020l.setOnClickListener(new h(this, xVar));
        }
        if (!q.y(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (h8 = new H()).f19556a) != (recyclerView = this.f27019k)) {
            N.a aVar = h8.f19557b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f19585A0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                h8.f19556a.setOnFlingListener(null);
            }
            h8.f19556a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                h8.f19556a.j(aVar);
                h8.f19556a.setOnFlingListener(h8);
                new Scroller(h8.f19556a.getContext(), new DecelerateInterpolator());
                h8.b();
            }
        }
        this.f27019k.j0(xVar.f27132a.f27032b.d(this.f27016g));
        O.n(this.f27019k, new j());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27012c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f27013d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27014e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f27015f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f27016g);
    }

    public final void p(u uVar) {
        x xVar = (x) this.f27019k.getAdapter();
        int iD = xVar.f27132a.f27032b.d(uVar);
        int iD2 = iD - xVar.f27132a.f27032b.d(this.f27016g);
        boolean z10 = Math.abs(iD2) > 3;
        boolean z11 = iD2 > 0;
        this.f27016g = uVar;
        if (z10 && z11) {
            this.f27019k.j0(iD - 3);
            this.f27019k.post(new i(this, iD));
        } else if (!z10) {
            this.f27019k.post(new i(this, iD));
        } else {
            this.f27019k.j0(iD + 3);
            this.f27019k.post(new i(this, iD));
        }
    }

    public final void q(CalendarSelector calendarSelector) {
        this.f27017h = calendarSelector;
        if (calendarSelector == CalendarSelector.f27025c) {
            this.j.getLayoutManager().t0(this.f27016g.f27117d - ((F) this.j.getAdapter()).f27010a.f27014e.f27032b.f27117d);
            this.f27022n.setVisibility(0);
            this.f27023o.setVisibility(8);
            this.f27020l.setVisibility(8);
            this.f27021m.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.f27024b) {
            this.f27022n.setVisibility(8);
            this.f27023o.setVisibility(0);
            this.f27020l.setVisibility(0);
            this.f27021m.setVisibility(0);
            p(this.f27016g);
        }
    }
}
