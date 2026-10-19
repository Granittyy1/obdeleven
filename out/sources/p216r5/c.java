package p216r5;

import android.util.Property;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ChildrenAlphaProperty.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f46347a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f10) {
        ViewGroup viewGroup2 = viewGroup;
        Float f11 = f10;
        float fFloatValue = f11.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
