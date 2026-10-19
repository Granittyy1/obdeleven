package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", l = {1426}, m = "invokeSuspend")
final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ Ia.a<p293xa.r> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Aa.c(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", l = {1430, 1434}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ Ia.a<p293xa.r> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Ia.a<p293xa.r> aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$anchorType = str;
            this.$onExpandedChange = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC1152c interfaceC1152c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC1152c = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                if (((androidx.compose.ui.input.pointer.q) obj) != null) {
                    this.$onExpandedChange.invoke();
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            interfaceC1152c = (InterfaceC1152c) this.L$0;
            PointerEventPass pointerEventPass = PointerEventPass.f14029b;
            this.L$0 = interfaceC1152c;
            this.label = 1;
            obj = TapGestureDetectorKt.c(interfaceC1152c, pointerEventPass, this, 1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) obj;
            if (kotlin.jvm.internal.i.a(this.$anchorType, "SecondaryEditable")) {
                qVar.a();
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.f14029b;
            this.L$0 = null;
            this.label = 2;
            obj = TapGestureDetectorKt.i(interfaceC1152c, pointerEventPass2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (((androidx.compose.ui.input.pointer.q) obj) != null) {
                this.$onExpandedChange.invoke();
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, Ia.a<p293xa.r> aVar, kotlin.coroutines.c<? super ExposedDropdownMenu_androidKt$expandable$1> cVar) {
        super(2, cVar);
        this.$anchorType = str;
        this.$onExpandedChange = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, cVar);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.w wVar = (androidx.compose.ui.input.pointer.w) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.b(wVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
