package com.featureprobe.sdk.server;

import java.util.Optional;

public final class HitResult {

    private boolean hit;

    private Optional<Integer> index = Optional.empty();

    private Optional<String> reason = Optional.empty();


    public HitResult(boolean result) {
        this.hit = result;
    }

    public HitResult(boolean hit, Optional<String> reason) {
        this.hit = hit;
        this.reason = reason;
    }

    public HitResult(boolean result, Optional<Integer> index, Optional<String> reason) {
        this.hit = result;
        this.index = index;
        this.reason = reason;
    }

    public boolean isHit() {
        return hit;
    }

    public Optional<Integer> getIndex() {
        return index;
    }

    public Optional<String> getReason() {
        return reason;
    }
}
