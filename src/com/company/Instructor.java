package com.company;

public class Instructor extends Student{
    private String weapon;
    private String experience;

    public Instructor() {
    }

    public Instructor(String weapon, String experience) {
        this.weapon = weapon;
        this.experience = experience;
    }

    public Instructor(Integer id, String name, String surname, String group, String school, String typeMagic, String login, String password, String weapon, String experience) {
        super(id, name, surname, group, school, typeMagic, login, password);
        this.weapon = weapon;
        this.experience = experience;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.getId() + " " + super.getName() + " " + super.getSurname() + " " +
                super.getGroup() + " " + super.getTypeMagic() + " " + super.getSchool() + " " +
                weapon + " " + experience + " " + super.getLogin() + " " + super.getPassword();
    }
}
