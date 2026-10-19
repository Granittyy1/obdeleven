package androidx.compose.ui.viewinterop;

import Ia.l;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.saveable.f;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.U;
import androidx.compose.ui.platform.AbstractComposeView;
import p293xa.r;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final T f15772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final NestedScrollDispatcher f15773C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final f f15774D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public f.a f15775E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public l<? super T, r> f15776F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public l<? super T, r> f15777G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public l<? super T, r> f15778H;

    public ViewFactoryHolder() {
        throw null;
    }

    public ViewFactoryHolder(Context context, l<? super Context, ? extends T> lVar, AbstractC1094k abstractC1094k, f fVar, int i10, U u10) {
        T tInvoke = lVar.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        super(context, abstractC1094k, i10, nestedScrollDispatcher, tInvoke, u10);
        this.f15772B = tInvoke;
        this.f15773C = nestedScrollDispatcher;
        this.f15774D = fVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objC = fVar != null ? fVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.e(new Ia.a<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                final /* synthetic */ ViewFactoryHolder<View> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // Ia.a
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.this$0.f15772B.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }, strValueOf));
        }
        l<View, r> lVar2 = AndroidView_androidKt.f15754a;
        this.f15776F = lVar2;
        this.f15777G = lVar2;
        this.f15778H = lVar2;
    }

    public static final void f(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(f.a aVar) {
        f.a aVar2 = this.f15775E;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f15775E = aVar;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.f15773C;
    }

    public final l<T, r> getReleaseBlock() {
        return this.f15778H;
    }

    public final l<T, r> getResetBlock() {
        return this.f15777G;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final l<T, r> getUpdateBlock() {
        return this.f15776F;
    }

    public final void setReleaseBlock(l<? super T, r> lVar) {
        this.f15778H = lVar;
        setRelease(new Ia.a<r>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final r invoke() {
                ViewFactoryHolder<T> viewFactoryHolder = this.this$0;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.f15772B);
                ViewFactoryHolder.f(this.this$0);
                return r.f47939a;
            }
        });
    }

    public final void setResetBlock(l<? super T, r> lVar) {
        this.f15777G = lVar;
        setReset(new Ia.a<r>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final r invoke() {
                ViewFactoryHolder<T> viewFactoryHolder = this.this$0;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f15772B);
                return r.f47939a;
            }
        });
    }

    public final void setUpdateBlock(l<? super T, r> lVar) {
        this.f15776F = lVar;
        setUpdate(new Ia.a<r>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final r invoke() {
                ViewFactoryHolder<T> viewFactoryHolder = this.this$0;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.f15772B);
                return r.f47939a;
            }
        });
    }

    public View getViewRoot() {
        return this;
    }
}
