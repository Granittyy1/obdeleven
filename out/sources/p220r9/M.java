package p220r9;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: RecyclerItemItemClickListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M implements RecyclerView.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f46424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureDetector f46425b;

    /* JADX INFO: compiled from: RecyclerItemItemClickListener.java */
    public interface b {
        void b(int i10);
    }

    public M(Context context, b bVar) {
        this.f46424a = bVar;
        this.f46425b = new GestureDetector(context, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        View viewE = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (viewE == null) {
            return false;
        }
        b bVar = this.f46424a;
        if (!this.f46425b.onTouchEvent(motionEvent)) {
            return false;
        }
        RecyclerView.B bN = RecyclerView.N(viewE);
        bVar.b(bN != null ? bN.getAbsoluteAdapterPosition() : -1);
        return true;
    }

    /* JADX INFO: compiled from: RecyclerItemItemClickListener.java */
    public class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void d(boolean z10) {
    }
}
