package p097h9;

import B7.b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.compose.ui.text.font.s;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.ViewOnClickListenerC2181y0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p009a8.f;
import p220r9.t;
import p220r9.y;
import p255u9.D;
import p255u9.i;
import p255u9.j;
import p279w9.a;
import p279w9.d;

/* JADX INFO: compiled from: ManualEditorFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class r extends BaseFragment implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShapeableImageView f36226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f36227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Switch f36228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f36229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f36230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f36231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f36232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D f36233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36234t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap f36235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MenuItem f36237w;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        boolean z10 = (this.f36230p.f36240d == null || this.f36229o.a().equals(this.f36230p.f36240d.c())) ? false : true;
        if (this.f36234t || this.f36231q.f36207i || z10) {
            C2137c.b(getContext(), R.string.view_part_editor_changes_wont_be_saved, R.string.common_yes, R.string.common_no).continueWith(new f(4, this), Task.UI_THREAD_EXECUTOR);
        } else {
            q().L();
        }
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i iVar;
        View viewInflate = layoutInflater.inflate(R.layout.manual_editor_fragment, viewGroup, false);
        int i10 = 1;
        setHasOptionsMenu(true);
        Context context = getContext();
        this.f36232r = new y(this);
        if (bundle != null) {
            this.f36229o = (i) bundle.getParcelable(i.class.getName());
            this.f36236v = bundle.getBoolean("edit");
            i iVar2 = this.f36229o;
            if (iVar2 != null) {
                this.f36233s = (D) iVar2.getParseObject("vehicleBase");
            }
        } else if (getArguments() != null) {
            this.f36229o = (i) getArguments().getParcelable(i.class.getName());
            this.f36233s = (D) getArguments().getParcelable("vehicleBase");
            this.f36236v = getArguments().getBoolean("edit");
            if (this.f36233s == null && (iVar = this.f36229o) != null) {
                this.f36233s = (D) iVar.getParseObject("vehicleBase");
            }
        }
        if (this.f36229o == null) {
            this.f36229o = new i();
        }
        final RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.manualEditorFragment_list);
        final ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.manualEditorFragment_progressSteps);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(false);
        ActivityC1347l activity = getActivity();
        y yVar = this.f36232r;
        j jVar = new j(activity);
        jVar.f36206h = new ArrayList();
        jVar.f36207i = false;
        jVar.f36205g = yVar;
        this.f36231q = jVar;
        recyclerView.setAdapter(jVar);
        if (this.f36229o.getObjectId() == null) {
            progressBar.setVisibility(8);
            j jVar2 = this.f36231q;
            jVar2.a(new j());
            jVar2.f36207i = true;
        } else {
            recyclerView.setVisibility(8);
            i iVar3 = this.f36229o;
            int i11 = j.f47474b;
            ParseQuery query = ParseQuery.getQuery(j.class);
            query.whereEqualTo("manual", iVar3);
            d.a(query, new a(b.c("MANUAL_STEPS", this.f36229o.getObjectId()), 86400000L), new d.b() { // from class: h9.l
                @Override // w9.d.b
                public final void g(List list, ParseException parseException) {
                    r rVar = this.f36215b;
                    rVar.getClass();
                    progressBar.setVisibility(8);
                    recyclerView.setVisibility(0);
                    ArrayList arrayList = new ArrayList();
                    if (parseException != null || list.isEmpty()) {
                        arrayList.add(new j());
                    } else {
                        arrayList.addAll(list);
                    }
                    j jVar3 = rVar.f36231q;
                    jVar3.f36795b = arrayList;
                    jVar3.notifyDataSetChanged();
                }
            });
        }
        View viewX = x(null, R.layout.manual_editor_list_header);
        this.f36226l = (ShapeableImageView) viewX.findViewById(R.id.manualEditorListHeader_cover);
        this.f36227m = (EditText) viewX.findViewById(R.id.manualEditorListHeader_title);
        this.f36228n = (Switch) viewX.findViewById(R.id.manualEditorListHeader_switch);
        ImageView imageView = (ImageView) viewX.findViewById(R.id.manualEditorListHeader_changeCover);
        this.f36228n.setChecked(this.f36229o.getBoolean("production"));
        this.f36228n.setOnCheckedChangeListener(this);
        imageView.setOnClickListener(new com.voltasit.obdeleven.presentation.b(3, this));
        this.f36227m.setText(this.f36229o.getString("name"));
        this.f36227m.addTextChangedListener(new p(this));
        if (this.f36229o.getParseFile("picture") != null) {
            com.bumptech.glide.b.c(getContext()).f(this).m(this.f36229o.getParseFile("picture").getUrl()).x(this.f36226l);
        }
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) viewX.findViewById(R.id.manualEditorListHeader_spinner);
        s sVar = new s(context, android.R.layout.simple_spinner_dropdown_item);
        ArrayList<ApplicationLanguage> arrayList = new ArrayList<>();
        sVar.f36239c = arrayList;
        sVar.f36240d = null;
        sVar.f36238b = context;
        Collections.addAll(arrayList, ApplicationLanguage.values());
        this.f36230p = sVar;
        appCompatSpinner.setAdapter((SpinnerAdapter) sVar);
        appCompatSpinner.setOnItemSelectedListener(this.f36230p);
        if (this.f36229o.a().isEmpty()) {
            appCompatSpinner.setSelection(0);
        } else {
            for (int i12 = 0; i12 < this.f36230p.getCount(); i12++) {
                if (this.f36230p.getItem(i12).c().equals(this.f36229o.a())) {
                    appCompatSpinner.setSelection(i12);
                }
            }
        }
        this.f36231q.i(viewX);
        View viewX2 = x(null, R.layout.manual_editor_list_footer);
        viewX2.findViewById(R.id.manualEditorList_addNewCard).setOnClickListener(new com.voltasit.obdeleven.presentation.vagpromo.b(2, this));
        this.f36231q.h(viewX2);
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewInflate.findViewById(R.id.manualEditorFragment_save);
        floatingActionButton.setOnClickListener(new ViewOnClickListenerC2181y0(this, i10, context));
        recyclerView.j(new t(floatingActionButton));
        this.f36231q.j = new m(this, (LinearLayoutManager) recyclerView.getLayoutManager(), floatingActionButton);
        if (q().E()) {
            this.f36226l.setMaxHeight(q().f33570z);
        }
        return viewInflate;
    }

    public final void O() {
        p279w9.b bVar = Application.f29634b;
        if (bVar.f(new a(s.b("MANUALS", this.f36233s.getObjectId()), 86400000L), true) != null) {
            bVar.a(new a(s.b("MANUALS", this.f36233s.getObjectId()), 86400000L));
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ManualEditorFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f36232r.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        this.f36234t = true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemAdd = menu.add(R.string.common_delete);
        this.f36237w = menuItemAdd;
        menuItemAdd.setIcon(2131231147);
        this.f36237w.setShowAsAction(1);
        this.f36237w.setOnMenuItemClickListener(new n(this, 0));
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MenuItem menuItem = this.f36237w;
        if (menuItem != null) {
            menuItem.setOnMenuItemClickListener(null);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(i.class.getName(), this.f36229o);
        bundle.putParcelable("vehicleBase", this.f36233s);
        bundle.putBoolean("edit", this.f36236v);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_manuals);
    }
}
