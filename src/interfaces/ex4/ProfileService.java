package interfaces.ex4;

public class ProfileService {
    public void saveProfile(ProfileRepository profileRepository) {
        profileRepository.save();
    }
}
