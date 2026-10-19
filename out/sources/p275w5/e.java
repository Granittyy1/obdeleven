package p275w5;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f47755b;

    public e(b bVar) {
        this.f47755b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f47755b;
        if (bVar.f26830k && bVar.isShowing()) {
            if (!bVar.f26832m) {
                TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bVar.f26831l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                bVar.f26832m = true;
            }
            if (bVar.f26831l) {
                bVar.cancel();
            }
        }
    }
}
