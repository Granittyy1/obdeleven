package p097h9;

import B7.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import io.intercom.android.sdk.models.Participant;
import java.util.Locale;
import p220r9.P;
import p220r9.t;
import p255u9.i;
import p255u9.j;
import p255u9.z;
import p279w9.a;
import p279w9.d;

/* JADX INFO: compiled from: ManualFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class u extends BaseFragment implements AdapterView.OnItemLongClickListener, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f36242l = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f36243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f36244n;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        q().L();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.manual_fragment, viewGroup, false);
        if (bundle != null) {
            this.f36242l = (i) bundle.getParcelable(i.class.getName());
        } else if (getArguments() != null) {
            this.f36242l = (i) getArguments().getParcelable(i.class.getName());
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.manualFragment_list);
        this.f36244n = recyclerView;
        O(recyclerView);
        RecyclerView recyclerView2 = this.f36244n;
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewInflate.findViewById(R.id.manualFragment_edit);
        ParseUser parseUser = this.f36242l.getParseUser(Participant.USER_TYPE);
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (parseUser == null || parseUser.getObjectId() == null || zVar == null || !parseUser.getObjectId().equals(zVar.getObjectId())) {
            floatingActionButton.h();
            i iVar = this.f36242l;
            iVar.put("usage", Integer.valueOf(iVar.getInt("usage") + 1));
            this.f36242l.saveInBackground();
        } else {
            recyclerView2.j(new t(floatingActionButton));
            floatingActionButton.n();
            viewInflate.findViewById(R.id.manualFragment_edit).setOnClickListener(new View.OnClickListener() { // from class: h9.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u uVar = this.f36241b;
                    uVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(i.class.getName(), uVar.f36242l);
                    bundle2.putBoolean("edit", true);
                    r rVar = new r();
                    rVar.setArguments(bundle2);
                    NavigationManager navigationManager = uVar.q().f33533B;
                    kotlin.jvm.internal.i.b(navigationManager);
                    navigationManager.n(rVar, null);
                }
            });
        }
        return viewInflate;
    }

    public final void O(RecyclerView recyclerView) {
        z zVar = new z(getContext(), this.f36242l);
        this.f36243m = zVar;
        zVar.f36258h = this;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(false);
        View viewX = x(null, R.layout.manual_step_list_header);
        if (q().E()) {
            ((ShapeableImageView) viewX.findViewById(R.id.manualListHeader_cover)).setMaxHeight(q().f33570z);
        }
        View viewX2 = x(null, R.layout.manual_step_list_footer);
        this.f36243m.i(viewX);
        this.f36243m.h(viewX2);
        recyclerView.setAdapter(this.f36243m);
        i iVar = this.f36242l;
        int i10 = j.f47474b;
        ParseQuery query = ParseQuery.getQuery(j.class);
        query.whereEqualTo("manual", iVar);
        query.addAscendingOrder("createdAt");
        d.a(query, new a(b.c("MANUAL_STEPS", this.f36242l.getObjectId()), 86400000L), new D7.i(this));
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            O(this.f36244n);
        } else if (callbackType == DialogCallback.CallbackType.f31101b) {
            r().h();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ManualFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserTrackingUtils.c(UserTrackingUtils.Key.f34267l, 1);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j) {
        if (getActivity() == null) {
            return false;
        }
        String string = ((j) this.f36243m.f36795b.get(i10)).getString("description");
        String string2 = getString(R.string.common_description);
        ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(string2, string);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
        MainActivity mainActivityQ = q();
        Locale locale = Locale.US;
        P.e(mainActivityQ, string2 + " " + getString(R.string.common_copied));
        view.setPressed(false);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(i.class.getName(), this.f36242l);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_manuals);
    }
}
