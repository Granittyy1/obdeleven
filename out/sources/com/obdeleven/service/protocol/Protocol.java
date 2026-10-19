package com.obdeleven.service.protocol;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Protocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29526a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public State f29528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Task<Void> f29530e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f29531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f29532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f29533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f29534e;

        static {
            State state = new State("DISCONNECTED", 0);
            f29531b = state;
            State state2 = new State("CONNECTED", 1);
            f29532c = state2;
            State state3 = new State("BUSY", 2);
            f29533d = state3;
            f29534e = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f29534e.clone();
        }
    }

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            synchronized (Protocol.this.f29526a) {
                while (true) {
                    try {
                        Protocol protocol = Protocol.this;
                        State state = protocol.f29528c;
                        if (state != State.f29531b) {
                            long jB = protocol.b(state);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = 0;
                            try {
                                if (jB != 0) {
                                    Protocol protocol2 = Protocol.this;
                                    if (jCurrentTimeMillis - protocol2.f29529d >= jB) {
                                        protocol2.f(protocol2.f29528c);
                                    }
                                }
                                Protocol.this.f29526a.wait(j);
                            } catch (InterruptedException unused) {
                                Protocol.this.f29528c = State.f29531b;
                                return;
                            }
                            if (jB != 0) {
                                j = jB - (jCurrentTimeMillis - Protocol.this.f29529d);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements Continuation<Void, Task<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29536a;

        public b(String str) {
            this.f29536a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<String> then(Task<Void> task) throws Exception {
            State state = State.f29533d;
            Protocol protocol = Protocol.this;
            protocol.h(state);
            return protocol.c(this.f29536a);
        }
    }

    public class c implements Continuation<String, Void> {
        public c() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            State state = State.f29532c;
            Protocol protocol = Protocol.this;
            protocol.h(state);
            boolean zIsFaulted = task.isFaulted();
            String str = protocol.f29527b;
            if (!zIsFaulted) {
                O.e.j(str, "response(" + task.getResult() + ")");
                return null;
            }
            Exception error = task.getError();
            O.e.j(str, "response(ERROR: " + error.getMessage() + ")");
            if ((error instanceof CommandException) && ((CommandException) error).a() == 7) {
                return null;
            }
            protocol.a();
            return null;
        }
    }

    public class d implements Continuation<Void, Task<Void>> {
        public d() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            Protocol.this.h(State.f29531b);
            return new SetProtocolCommand(SetProtocolCommand.Protocol.NULL).a();
        }
    }

    public class e implements Continuation<Void, Task<Void>> {
        public e() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            State state = State.f29533d;
            Protocol protocol = Protocol.this;
            protocol.h(state);
            return protocol.e();
        }
    }

    public Protocol(String str) {
        a aVar = new a();
        this.f29527b = str;
        this.f29530e = Task.forResult(null);
        h(State.f29532c);
        aVar.start();
    }

    public final Task<Void> a() {
        State state;
        O.e.j(this.f29527b, "disconnect()");
        synchronized (this.f29526a) {
            state = this.f29528c;
        }
        if (state == State.f29531b) {
            return Task.forResult(null);
        }
        Task<Void> taskContinueWithTask = this.f29530e.continueWithTask(new e()).continueWithTask(new d());
        this.f29530e = taskContinueWithTask;
        return taskContinueWithTask;
    }

    public abstract long b(State state);

    public abstract Task<String> c(String str);

    public final boolean d() {
        State state;
        synchronized (this.f29526a) {
            state = this.f29528c;
        }
        return state != State.f29531b;
    }

    public abstract Task<Void> e();

    public abstract void f(State state);

    public final Task<String> g(String str) {
        State state;
        O.e.j(this.f29527b, androidx.compose.foundation.gestures.d.b("request(", str, ")"));
        synchronized (this.f29526a) {
            state = this.f29528c;
        }
        if (state == State.f29531b) {
            return Task.forError(new CommandException(-2));
        }
        Task taskContinueWithTask = this.f29530e.continueWithTask(new b(str));
        this.f29530e = taskContinueWithTask.continueWith(new c());
        return taskContinueWithTask;
    }

    public final void h(State state) {
        O.e.j(this.f29527b, "setState(" + state.name() + ")");
        synchronized (this.f29526a) {
            this.f29529d = System.currentTimeMillis();
            this.f29528c = state;
            this.f29526a.notifyAll();
        }
    }
}
