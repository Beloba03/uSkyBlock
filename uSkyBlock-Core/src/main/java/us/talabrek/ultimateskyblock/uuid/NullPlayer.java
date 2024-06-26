package us.talabrek.ultimateskyblock.uuid;

import org.bukkit.BanEntry;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.profile.PlayerProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.bukkit.BanEntry;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.time.Instant;
import java.time.Duration;
import java.util.Date;



public class NullPlayer implements OfflinePlayer {
    public static final NullPlayer INSTANCE = new NullPlayer();
    private NullPlayer() {
    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public Location getRespawnLocation() {
        return null;
    }

    @Override
    public String getName() {
        return PlayerDB.UNKNOWN_PLAYER_NAME;
    }

    @Override
    public UUID getUniqueId() {
        return PlayerDB.UNKNOWN_PLAYER_UUID;
    }

    @NotNull
    @Override
    public PlayerProfile getPlayerProfile() {
        return null;
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Nullable
    @Override
    public BanEntry<PlayerProfile> ban(@Nullable String s, @Nullable Date date, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public BanEntry<PlayerProfile> ban(@Nullable String s, @Nullable Instant instant, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public BanEntry<PlayerProfile> ban(@Nullable String s, @Nullable Duration duration, @Nullable String s1) {
        return null;
    }

    @Override
    public boolean isWhitelisted() {
        return true;
    }

    @Override
    public void setWhitelisted(boolean b) {

    }

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public long getFirstPlayed() {
        return 0;
    }

    @Override
    public long getLastPlayed() {
        return 0;
    }

    @Override
    public boolean hasPlayedBefore() {
        return false;
    }

    @Override
    public Location getBedSpawnLocation() {
        return null;
    }

    @Nullable
    @Override
    public Location getRespawnLocation() {
        return null;
    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic) throws IllegalArgumentException {

    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic, int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic, int amount) throws IllegalArgumentException {

    }

    @Override
    public void setStatistic(@NotNull Statistic statistic, int newValue) throws IllegalArgumentException {

    }
    @Override
    public BanEntry ban(String reason, Instant expiration, String source) {
        // Since this player is "null", decide on an appropriate no-op or dummy implementation
        return null;
    }
    
    @Override
    public BanEntry ban(String reason, Duration duration, String source) {
        // Since this player is "null", decide on an appropriate no-op or dummy implementation
        return null;
    }

    @Override
    public BanEntry ban(String reason, Date expiration, String source) {
        // Implement according to the interface's expectations.
        // Since NullPlayer might represent a non-operative concept, decide how to handle this method.
        return null; // Again, be cautious with returning null.
    }
    

    @Override
    public int getStatistic(@NotNull Statistic statistic) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic, @NotNull Material material) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic, @NotNull Material material) throws IllegalArgumentException {

    }

    @Override
    public int getStatistic(@NotNull Statistic statistic, @NotNull Material material) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic, @NotNull Material material, int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic, @NotNull Material material, int amount) throws IllegalArgumentException {

    }

    @Override
    public void setStatistic(@NotNull Statistic statistic, @NotNull Material material, int newValue) throws IllegalArgumentException {

    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType) throws IllegalArgumentException {

    }

    @Override
    public int getStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType, int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType, int amount) {

    }

    @Override
    public void setStatistic(@NotNull Statistic statistic, @NotNull EntityType entityType, int newValue) {

    }

    @Nullable
    @Override
    public Location getLastDeathLocation() {
        return null;
    }

    @Nullable
    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public Map<String, Object> serialize() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean b) {

    }


}
