package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.I;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super SharingCommand>, Integer, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, kotlin.coroutines.c<? super StartedWhileSubscribed$command$1> cVar) {
        super(3, cVar);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super SharingCommand> interfaceC2687d, Integer num, kotlin.coroutines.c<? super p293xa.r> cVar) {
        int iIntValue = num.intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, cVar);
        startedWhileSubscribed$command$1.L$0 = interfaceC2687d;
        startedWhileSubscribed$command$1.I$0 = iIntValue;
        return startedWhileSubscribed$command$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2687d interfaceC2687d;
        SharingCommand sharingCommand;
        long j;
        SharingCommand sharingCommand2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    interfaceC2687d = (InterfaceC2687d) this.L$0;
                    kotlin.b.b(obj);
                    if (this.this$0.f43361b > 0) {
                        sharingCommand = SharingCommand.f43355c;
                        this.L$0 = interfaceC2687d;
                        this.label = 3;
                        if (interfaceC2687d.emit(sharingCommand, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j = this.this$0.f43361b;
                        this.L$0 = interfaceC2687d;
                        this.label = 4;
                        if (I.b(j, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i10 == 3) {
                    interfaceC2687d = (InterfaceC2687d) this.L$0;
                    kotlin.b.b(obj);
                    j = this.this$0.f43361b;
                    this.L$0 = interfaceC2687d;
                    this.label = 4;
                    if (I.b(j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i10 == 4) {
                    interfaceC2687d = (InterfaceC2687d) this.L$0;
                    kotlin.b.b(obj);
                } else if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sharingCommand2 = SharingCommand.f43356d;
                this.L$0 = null;
                this.label = 5;
                if (interfaceC2687d.emit(sharingCommand2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            interfaceC2687d = (InterfaceC2687d) this.L$0;
            if (this.I$0 > 0) {
                SharingCommand sharingCommand3 = SharingCommand.f43354b;
                this.label = 1;
                if (interfaceC2687d.emit(sharingCommand3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                long j10 = this.this$0.f43360a;
                this.L$0 = interfaceC2687d;
                this.label = 2;
                if (I.b(j10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (this.this$0.f43361b > 0) {
                    sharingCommand = SharingCommand.f43355c;
                    this.L$0 = interfaceC2687d;
                    this.label = 3;
                    if (interfaceC2687d.emit(sharingCommand, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = this.this$0.f43361b;
                    this.L$0 = interfaceC2687d;
                    this.label = 4;
                    if (I.b(j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                sharingCommand2 = SharingCommand.f43356d;
                this.L$0 = null;
                this.label = 5;
                if (interfaceC2687d.emit(sharingCommand2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return p293xa.r.f47939a;
    }
}
