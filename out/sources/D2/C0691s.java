package D2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: D2.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GhostViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0691s extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2688d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f2689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2690c;

    public static void a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f2690c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.f2689b;
            viewGroup.setTag(R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.f2690c = false;
        }
    }
}
